package com.app.contactController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.app.binding.Contact;
import com.app.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService service;
	
	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {
		
		return this.service.createContact(contact);
		
	}
	
	
	@GetMapping("/contact/{id}")
	public Contact contactFindById(@PathVariable int  id) {
		
		return this.service.getContactById(id);
	}
	
	
	@GetMapping("/contacts")
	public List<Contact> getAllContact(){
		
		return this.service.getAllContact();
	}
	
	/*
	 * @PutMapping("/contact") 
	 * public String updateContact(@RequestBody Contact
	 * contacts) {
	 * 
	 * return this.updateContact(contacts); }
	 * 
	 */
	
	@PutMapping("/contact")
	public String updated(@RequestBody Contact contact) {
		
		return this.service.updateContact(contact);
		
	}
	
	
	@DeleteMapping("/contact/{contact}")
	public String deleteContactById(@PathVariable int contact) {
		
		return this.service.deleteContactById(contact);
	}
}
