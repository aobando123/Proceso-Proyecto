/**
 * 
 */
package com.proceso.entities;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
/**
 * @author Administrator
 *
 */
@Entity()
public class ProcessSchema extends ObjectEntity {
	@Indexed(options = @IndexOptions(unique = true))
	private String ProcessName;
	@Embedded
	private ArrayList<TaskSchema> lstTasks;

	/**
	 * 
	 */
	public ProcessSchema() {
		
		// TODO Auto-generated constructor stub
	}
	
	public ProcessSchema(String name) {
		ProcessName = name;
	}


	public String getProcessName() {
		return ProcessName;
	}


	public ArrayList<TaskSchema> getLstTasks() {
		return lstTasks;
	}

	public void setLstTasks(ArrayList<TaskSchema> lstTasks) {
		this.lstTasks = lstTasks;
	}

	public void setProcessName(String processName) {
		ProcessName = processName;
	}
	

}
