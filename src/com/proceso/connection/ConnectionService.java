package com.proceso.connection;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;


public class ConnectionService {
	private Morphia morphia() {
		final Morphia morphia = new Morphia();
		morphia.mapPackage("org.mongodb.morphia.example");

		return morphia;
	}
	
	public Datastore datastore() {
		final Datastore datastore = morphia().createDatastore(new MongoClient(), "ProcessAutomation");
		datastore.ensureIndexes();

		return datastore;
	}
}
