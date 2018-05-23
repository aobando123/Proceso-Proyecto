package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.entities.ObjectEntity;
public interface ServiceInterface<T> {
	
	 public  Key<T> create(ObjectEntity entity);

	 public T read(ObjectId id);
	 
	 public UpdateResults update(ObjectEntity entity, UpdateOperations<ObjectEntity> operations);

	 public WriteResult delete(ObjectEntity entity);
	 
	 public UpdateOperations<T> createOperations();
	 public List<T> readAll();

}
