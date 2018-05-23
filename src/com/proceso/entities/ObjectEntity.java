/**
 * 
 */
package com.proceso.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

/**
 * @author Administrator
 *
 */
public abstract class ObjectEntity {
	@Id
	protected ObjectId Id;

	public ObjectId getId() {
		return Id;
	}

	public void setId(ObjectId id) {
		Id = id;
	}
	
}
