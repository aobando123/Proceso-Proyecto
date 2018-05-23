package com.proceso.controller;

import com.proceso.entities.ObjectEntity;
import java.util.List;
public interface ControllerInterface {
	
	public void Create(ObjectEntity entity);
	
	public void Update (ObjectEntity entity);
	
	public void Delete (ObjectEntity entity);
	
	public ObjectEntity ReadObject (ObjectEntity entity);
	
	public List<ObjectEntity> ReadAll ();

}
