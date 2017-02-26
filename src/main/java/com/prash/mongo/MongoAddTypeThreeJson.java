package com.prash.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

/**
 * This method is to demonstrate the add json object to the mongoDB 
 * 
 * 
 * @author prashanth
 *
 */
public class MongoAddTypeThreeJson {
	
	public static void main(String str[]) throws UnknownHostException{
		
		MongoClient client = new MongoClient("localhost",27017);
		DB db = client.getDB("App");
		DBCollection collection = db.getCollection("ADD");
		
		DBObject obj = (DBObject) JSON.parse("{'name':'name1','name2':'name4'}");
		collection.insert(obj);
		
		FindClass.find(collection);
	}

}
