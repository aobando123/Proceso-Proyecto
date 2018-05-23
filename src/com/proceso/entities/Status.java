/**
 * 
 */
package com.proceso.entities;

import org.mongodb.morphia.annotations.Entity;

/**
 * @author Administrator
 *
 */
@Entity()
public class Status extends ObjectEntity {

	private String statusName;
	/**
	 * 
	 */
	public Status() {
	}
	public Status(String statusName) {
		this.statusName = statusName;
	}
	/**
	 * @return the statusName
	 */
	public String getStatusName() {
		return statusName;
	}
	/**
	 * @param statusName the statusName to set
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
