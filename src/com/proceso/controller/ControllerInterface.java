package com.proceso.controller;

import com.proceso.entities.ObjectEntity;

import java.util.ArrayList;
public interface ControllerInterface {
	
	public void Create(ObjectEntity entity);
	
	public void Update (ObjectEntity entity);
	
	public void Delete (ObjectEntity entity);
	
	public <T> T ReadObject (ObjectEntity entity);
	
	public <T> ArrayList<T> ReadAll ();

}
