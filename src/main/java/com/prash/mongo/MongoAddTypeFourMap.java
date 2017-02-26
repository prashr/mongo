package com.prash.mongo;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoAddTypeFourMap {
	
	public static void main(String str[]) throws UnknownHostException{
		
		MongoClient client = new MongoClient("localhost",27017);
		
		DB db = client.getDB("App");
		
		DBCollection collection = db.getCollection("ADD");
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("test", "test1");
		map.put("test2", "test3");
		Map<String, Object> map1 = new HashMap<>();
		map.put("MAP" , map1);
		map1.put("test5", "mapt6");
		map1.put("test6", "map9");
		
		collection.insert(new BasicDBObject(map));
		
		FindClass.find(collection);
		
		
		
	}

}
