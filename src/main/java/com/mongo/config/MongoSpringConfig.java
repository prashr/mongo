package com.mongo.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class MongoSpringConfig {

	public @Bean MongoTemplate getMongo() throws UnknownHostException{
		MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("localhost",27017), "App");
		return mongoTemplate;
	}
	
}
