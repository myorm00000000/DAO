package com.example.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class represents the User model which represents a single row of the
 * 'User' table of the 'javabase' database.
 * 
 * 
 * @link http://balusc.blogspot.com/2008/07/dao-tutorial-data-layer.html
 * 
 */
public class User implements Serializable {

	private static final long serialVersionUID = 3116456602658670804L;

	private Long id;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private Date birthdate;

	// ////// GETTERS AND SETTERS ////////////

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate
	 *            the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	// /////////// OBJECT OVERRIDES //////////////////

	/*
	 * The user ID is unique for each User. So this should compare User by ID
	 * only.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		return (other instanceof User) && (id != null) ? id
				.equals(((User) other).id) : (other == this);
	}

	/*
	 * The user ID is unique for each User. So User with same ID should return
	 * same hashcode.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (id != null) ? (this.getClass().hashCode() + id.hashCode())
				: super.hashCode();
	}

	/*
	 * Returns the String representation of this User.(Optional)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"User[id=%d,email=%s,firstname=%s,lastname=%s,birthdate=%s]",
				id, email, firstname, lastname, birthdate);
	}

}
