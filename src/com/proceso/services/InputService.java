package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.DBCollection;
import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.UserType;
import com.proceso.entities.InputType;

public class InputService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public InputService() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Key<InputType> create(ObjectEntity entity) {
		InputType inputType = (InputType) entity;
		return con.datastore().save(inputType);
	}
	@Override
	public InputType read(ObjectId id) {
		// TODO Auto-generated method stub
		return con.datastore().get(InputType.class, id);
	}
	
	 public UpdateResults updates(ObjectEntity entity, UpdateOperations<InputType> operations) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WriteResult delete(ObjectEntity entity) {
		InputType inputType = (InputType) entity;
		return con.datastore().delete(inputType);
	}
	@Override
	public UpdateOperations<InputType> createOperations() {
		return null;
	}
	@Override
	public List<InputType> readAll() {
		DBCollection m = con.datastore().getCollection( UserType.class );
		List<InputType> list = con.datastore().find( InputType.class ).asList();
		
		return list;
	}
	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		return null;
	}

	

	

}
