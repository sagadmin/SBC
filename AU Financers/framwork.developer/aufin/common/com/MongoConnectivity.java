package aufin.common.com;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoConnectivity {
	
	public static void main(String args[]) throws UnknownHostException{
		
		connection();
	}
	
	
	public static void connection() throws UnknownHostException{
		
		MongoClient mongo = new MongoClient("localhost",27017);
		
		DB db = mongo.getDB("dbName");
		DBCollection dbCollection = db.getCollection("ishant");
		BasicDBObject document = new BasicDBObject();
		document.put("CUSTOMER TYPE", "INDIVIDUAL");
		
	}
	
	
	 
	
}
