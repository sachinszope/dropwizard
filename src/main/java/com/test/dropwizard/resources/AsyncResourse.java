package com.test.dropwizard.resources;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.test.dropwizard.dao.AsyncDAO;

@Path("/async")
public class AsyncResourse {

	private static final Logger logger = LoggerFactory.getLogger(AsyncResourse.class);
	private static final ExecutorService executorService = Executors.newCachedThreadPool();
	private Timer responses = null;
	private AsyncDAO asyncDao; 
	
	private final String GET = "GET";
	
	public AsyncResourse(AsyncDAO asyncDao, MetricRegistry metrics) {
		this.asyncDao = asyncDao;
		responses = 	metrics.timer(AsyncResourse.class.getName());
	}
	
	@GET
	public void getCount(@Suspended final AsyncResponse asyncResponse) {
		final Timer.Context context = responses.time();
		logger.info("GET request received");
		checkExist(GET);
		executorService.submit(new Runnable() {
			
			public void run() {
				try {
					logger.info("started new thread");
					int [] numbers = {10, 20, 30, 40, 50};
	
				      for(int x : numbers ){
				         logger.info(Thread.currentThread().getName() + "==> printing number:" + x);
				         Thread.sleep(2000l);
				      }
				} catch(Exception e) {
					logger.error(e.getMessage());
				} 
				asyncResponse.resume("complete");
			}
		});
		context.stop();
	}
	
	private void checkExist(String method) {
		int reqCnt = asyncDao.getCount(method);
		logger.info("number of " + method + " requests:" + reqCnt);
		if(reqCnt > 0) {
			asyncDao.udpate(method);
			return;
		}
		asyncDao.insert(method, 1);
	}
}
