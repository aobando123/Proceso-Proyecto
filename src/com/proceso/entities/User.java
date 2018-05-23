package com.proceso.entities;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Reference;

@Entity()
public class User extends ObjectEntity {
	private String UserName;
	@Indexed(options = @IndexOptions(unique = true))
	private String Email;
	private String Password;
	@Reference
	private UserType UserGroup;
	
	public UserType getUserGroup() {
		return UserGroup;
	}
	public void setUserGroup(UserType userGroup) {
		UserGroup = userGroup;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String UserName, String Email, String Password) {
		this.UserName = UserName;
		this.Email = Email;
		this.Password = Password;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

}
