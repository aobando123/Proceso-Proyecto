package com.proceso.controller;

import java.util.List;

import com.proceso.entities.ObjectEntity;
import com.proceso.entities.UserType;
import com.proceso.services.UserTypeService;
public class UserTypeController{

	UserTypeService us = new UserTypeService();
	
	public UserTypeController() {
		// TODO Auto-generated constructor stub
	}

	
	public void Create(ObjectEntity entity) {
		UserType ut = (UserType) entity;
		us.create(entity);
	}


	public void Update(ObjectEntity entity) {
		// TODO Auto-generated method stub
		
	}


	public void Delete(ObjectEntity entity) {
		// TODO Auto-generated method stub
		
	}


	public ObjectEntity ReadObject(ObjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<UserType> ReadAll() {
		return us.readAll();
		 
	}
}
