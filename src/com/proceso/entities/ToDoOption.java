package com.proceso.entities;

import org.mongodb.morphia.annotations.Entity;

@Entity()
public class ToDoOption extends ObjectEntity{
	private String OptionDescription;
	private String OptionValue;
	
	public ToDoOption() {
		
	}
	

	/**
	 * @param optionDescription
	 * @param optionValue
	 */
	public ToDoOption(String optionDescription, String optionValue) {
		super();
		OptionDescription = optionDescription;
		OptionValue = optionValue;
	}


	/**
	 * @return the optionDescription
	 */
	public String getOptionDescription() {
		return OptionDescription;
	}

	/**
	 * @param optionDescription the optionDescription to set
	 */
	public void setOptionDescription(String optionDescription) {
		OptionDescription = optionDescription;
	}

	/**
	 * @return the optionValue
	 */
	public String getOptionValue() {
		return OptionValue;
	}

	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(String optionValue) {
		OptionValue = optionValue;
	}

}
