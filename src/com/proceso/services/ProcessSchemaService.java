package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.ProcessSchema;

public class ProcessSchemaService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public ProcessSchemaService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<ProcessSchema> create(ObjectEntity entity) {
		ProcessSchema processSchema = (ProcessSchema) entity;
		return con.datastore().save(processSchema);
	}


	@Override
	public ObjectEntity read(ObjectId id) {

		return con.datastore().get(ProcessSchema.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		ProcessSchema processSchema = (ProcessSchema) entity;
		return con.datastore().update(processSchema, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		ProcessSchema processSchema = (ProcessSchema) entity;
		return con.datastore().delete(processSchema);
	}


	@Override
	public UpdateOperations<ProcessSchema> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ProcessSchema> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
