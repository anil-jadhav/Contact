package com.app.service;

import java.util.List;

import com.app.binding.Contact;

public interface ContactService {
	
	public String createContact(Contact contact);
	
	public Contact getContactById(int id);
	
	public List<Contact> getAllContact();
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(int contact);
	

}
