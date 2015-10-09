package com.test.dropwizard;

import java.util.concurrent.TimeUnit;

import org.skife.jdbi.v2.DBI;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.test.dropwizard.dao.AsyncDAO;
import com.test.dropwizard.dao.CollectionDAO;
import com.test.dropwizard.dao.CollectionItemDAO;
import com.test.dropwizard.dao.UserDAO;
import com.test.dropwizard.resources.AsyncResourse;
import com.test.dropwizard.resources.CollectionItemResource;
import com.test.dropwizard.resources.CollectionResource;
import com.test.dropwizard.resources.UserResource;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;

public class UserService extends Application<UserServiceConfiguration> {
	
	static final MetricRegistry metrics = new MetricRegistry();

	public static void main(String[] arguments) throws Exception {
		startReport();
		new UserService().run(arguments);
	}

	@Override
	public void run(UserServiceConfiguration userConfiguration, Environment environment) throws Exception {
		final DBIFactory factory = new DBIFactory();
		final DBI dbi = factory.build(environment, userConfiguration.getDatabase(), "gooru_local");
		
		final UserDAO userDao = dbi.onDemand(UserDAO.class);
		final CollectionDAO collectionDao = dbi.onDemand(CollectionDAO.class);
		final CollectionItemDAO collectionItemDao = dbi.onDemand(CollectionItemDAO.class);
		final AsyncDAO asyncDao = dbi.onDemand(AsyncDAO.class);
		
		environment.jersey().register(new UserResource(userDao));
		environment.jersey().register(new CollectionResource(collectionDao, collectionItemDao, metrics));
		environment.jersey().register(new CollectionItemResource(collectionItemDao));
		environment.jersey().register(new AsyncResourse(asyncDao, metrics));
	}
	
	static void startReport() {
		ConsoleReporter consoleReporter = ConsoleReporter.forRegistry(metrics)
			.convertRatesTo(TimeUnit.SECONDS)
			.convertDurationsTo(TimeUnit.MILLISECONDS)
			.build();
		consoleReporter.start(10, TimeUnit.SECONDS);
	}
}
