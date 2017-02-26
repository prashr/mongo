package com.prash.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

//BasicDBObjectBuilder
public class MongoAddTypeTwo {
	public static void main(String str[]) throws UnknownHostException{
		MongoClient client = new MongoClient("localhost",27017);
		DB db = client.getDB("App");
		DBCollection table = db.getCollection("ADD");
		
		System.out.println(" ***** ADD ***** ");
		
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().
				add("test", "test1").add("test2", "test3").add("test4","test5");
		BasicDBObjectBuilder builder2 = BasicDBObjectBuilder.start()
				.add("test", "test1").add("test2", "test3").add("test4", "test5");
		builder.add("BigTest", builder2.get());
		
		
		table.insert(builder.get());
		
		
		FindClass.find(table);
		
		
	}


}
