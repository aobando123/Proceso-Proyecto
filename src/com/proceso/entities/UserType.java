package com.proceso.entities;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.IndexOptions;
@Entity()

public class UserType extends ObjectEntity {
	@Indexed(options = @IndexOptions(unique = true))
	private String UserTypeName;

	public UserType() {
		// TODO Auto-generated constructor stub

	}
	public UserType(String UserTypeName) {
		this.UserTypeName = UserTypeName;
		
	}
	/**
	 * @return the userTypeName
	 */
	public String getUserTypeName() {
		return UserTypeName;
	}
	/**
	 * @param userTypeName the userTypeName to set
	 */
	public void setUserTypeName(String userTypeName) {
		UserTypeName = userTypeName;
	}

}
