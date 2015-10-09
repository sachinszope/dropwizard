package com.test.dropwizard.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericUtil {
	public static String getJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			if(object != null)
			json = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return json;
	}
}
