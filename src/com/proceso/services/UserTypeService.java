/**
 * 
 */
package com.proceso.services;

import com.proceso.connection.ConnectionService;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.DBCollection;
import com.mongodb.WriteResult;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.UserType;

/**
 * @author Administrator
 *
 */
public class UserTypeService implements ServiceInterface {

	/**
	 * 
	 */
	

	private ConnectionService con = new ConnectionService();
	public UserTypeService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<UserType> create(ObjectEntity entity) {
		UserType userType = (UserType) entity;
		return con.datastore().save(userType);
	}


	@Override
	public UserType read(ObjectId id) {

		return con.datastore().get(UserType.class, id);
	}



	public UpdateResults updates(ObjectEntity entity, UpdateOperations<UserType> operations) {
		
		UserType userType = (UserType) entity;
		return con.datastore().update(userType, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		UserType userType = (UserType) entity;
		return con.datastore().delete(userType);
	}


	@Override
	public UpdateOperations<ObjectEntity> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserType> readAll() {
		DBCollection m = con.datastore().getCollection( UserType.class );
		List<UserType> list = con.datastore().find( UserType.class ).asList();
		
		return list;
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		// TODO Auto-generated method stub
		return null;
	}

}
