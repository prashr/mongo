package com.prash.mongo;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

/**
 * Java + MongoDB Hello world Example
 *
 */
public class App2DBs {
	public static void main(String[] args) {

		try {

			/**** Connect to MongoDB ****/
			// Since 2.10.0, uses MongoClient
			MongoClient mongo = new MongoClient("localhost", 27017);

			/**** Get database ****/
			// if database doesn't exists, MongoDB will create it for you

			/**** Get collection / table from 'testdb' ****/
			// if collection doesn't exists, MongoDB will create it for you

			List<String> dbs = mongo.getDatabaseNames();
			dbs.stream().forEach(System.out::println);

			for (String database : dbs) {
				DB db = mongo.getDB(database);
				System.out.println("Database is : " + database + "\n");
				Set<String> dbsets = db.getCollectionNames();
				dbsets.stream().forEach(System.out::print);
				for (String collection : dbsets) {
					DBCollection table = db.getCollection(collection);

					System.out.println(table.toString());

				}
			}

			// DBCollection table = db.getCollection(database);

			/**** Done ****/
			System.out.println("Done");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}

	}
}
