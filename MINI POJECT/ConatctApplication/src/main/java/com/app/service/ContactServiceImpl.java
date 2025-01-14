package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.binding.Contact;
import com.app.repository.ContactRepositoy;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepositoy repo;
	@Override
	public String createContact(Contact contact) {
	
		 contact = repo.save(contact);
		
		 return "Sucessfylly created contact";
		
	}

	
	@Override
	public Contact getContactById(int id) {
	
		Optional<Contact> findById = repo.findById(id);
		
		if(findById.isPresent()) {
			
			Contact contact = findById.get();
			
			return contact;
		}
		
		
		return null;
	}

	@Override
	public List<Contact> getAllContact() {


			List<Contact> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public String updateContact(Contact contact) {
		
		if(repo.existsById(contact.getContactId())) {
			
			repo.save(contact);
			
			return "Updated Contact";
		}else
		{
			return "Record Not Found";
		}
		
	}

	@Override
	public String deleteContactById(int contactId) {

			if(repo.existsById(contactId))
			{
				repo.deleteById(contactId);
				
				return "Record Deleted..........!";
			}else {
				
				return "Record not Found.....!";
			}

		
	}

	
	
	
}
