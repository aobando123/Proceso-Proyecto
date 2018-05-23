package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.InputType;

public class InputService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public InputService() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Key<InputType> create(ObjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public InputType read(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 public UpdateResults updates(ObjectEntity entity, UpdateOperations<InputType> operations) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WriteResult delete(ObjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UpdateOperations<InputType> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<InputType> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
