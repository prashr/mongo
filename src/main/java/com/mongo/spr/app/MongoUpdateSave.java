package com.mongo.spr.app;

import com.mongo.config.MongoSpringConfig;
import com.mongodb.DBCollection;
import com.mongodb.QueryBuilder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class MongoUpdateSave {
	
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(MongoSpringConfig.class);
		MongoOperations mongoOperations = (MongoOperations) context.getBean("getMongo");
		//DBCollection collection = FindClass.getCollection();
		Query query =  new Query();
		query.addCriteria(Criteria.where("name").is("Prashanth"));
		
		//mongoOperations.findOne(query, arg1)
		
	}

}
