package com.prash.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class FindClass {
	
	public static void find(DBCollection collection){
		
		DBCursor cursor = collection.find();
		
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
	}
	
	public static DBCollection getCollection() {

		MongoClient client;
		DBCollection collection = null;

		try {
			
			client = new MongoClient("localhost", 27017);
			DB db = client.getDB("App");
			collection = db.getCollection("ADD");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return collection;
	}

}
