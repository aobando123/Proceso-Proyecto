package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.Status;
import com.proceso.entities.ObjectEntity;

public class StatusService implements ServiceInterface{

	private ConnectionService con = new ConnectionService();
	public StatusService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<Status> create(ObjectEntity entity) {
		Status status = (Status) entity;
		return con.datastore().save(status);
	}


	@Override
	public Status read(ObjectId id) {

		return con.datastore().get(Status.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		Status status = (Status) entity;
		return con.datastore().update(status, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		Status status = (Status) entity;
		return con.datastore().delete(status);
	}


	@Override
	public UpdateOperations<Status> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Status> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
