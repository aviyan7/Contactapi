package com.aadiminnovation.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadiminnovation.contact.entity.Contact;
import com.aadiminnovation.contact.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	ContactRepository repo;
	
	public Contact savecontact(Contact contact) {
		return repo.save(contact);
	}
	
	public List<Contact> savecontacts(List<Contact> contacts) {
		return (List<Contact>) repo.saveAll(contacts);
	}
	
	public List<Contact> getcontacts() {
		return (List<Contact>) repo.findAll();
	}
	
	public Contact getcontactById(int id) {
		return repo.findById(id).orElse(null);
	}

}
