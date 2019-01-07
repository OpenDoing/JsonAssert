package com.json.compare;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompareApplication {


	public static void main(String[] args) throws JSONException {
		SpringApplication.run(CompareApplication.class, args);
	}

}

