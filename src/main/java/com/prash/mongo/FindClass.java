package com.prash.mongo;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class FindClass {
	
	public static void find(DBCollection collection){
		
		DBCursor cursor = collection.find();
		
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
	}

}
