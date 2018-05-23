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
public class ProcessSchema extends ObjectEntity {
	
	private String ProcessName;
	

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


	public void setProcessName(String processName) {
		ProcessName = processName;
	}
	

}
