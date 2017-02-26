package com.prash.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class MongoAddTypeOne {

	public static void main(String str[]){
		try {
			MongoClient  client = new MongoClient("localhost", 27017);
			DB db = client.getDB("App");
			DBCollection table = db.getCollection("ADD");
			
			System.out.println(" ***** ADD ***** ");
			
			BasicDBObject object = new BasicDBObject();
			object.put("name", "Prashanth");
			object.put("age", 30);
			object.put("class", "MCA");
			
			BasicDBObject addr1 = new BasicDBObject();
			addr1.put("num","1995");
			addr1.put("corss", "6th B Cross");
			addr1.put("area", "KST");
			
			BasicDBObject addr2 = new BasicDBObject();
			addr2.put("num","62");
			addr2.put("corss", "Halebeedi");
			addr2.put("area", "Yelethotadha halli");

			object.put("addr1",addr1);
			object.put("addr2",addr2);
			table.insert(object);
			
			
			
			FindClass.find(table);
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
