package com.app.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	
	@Id
	private int contactId;
	private String contactName;
	private String contactEmail;
	private long contactPassword;
	public Contact(int contactId, String contactName, String contactEmail, long contactPassword) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactPassword = contactPassword;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public long getContactPassword() {
		return contactPassword;
	}
	public void setContactPassword(long contactPassword) {
		this.contactPassword = contactPassword;
	}
	
	
	 
	

}
