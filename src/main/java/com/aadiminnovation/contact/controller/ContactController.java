package com.aadiminnovation.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aadiminnovation.contact.entity.Contact;
import com.aadiminnovation.contact.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	ContactService service;
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return service.savecontact(contact);
	}
	
	@PostMapping("/addContacts")
	public List<Contact> addUsers(@RequestBody List<Contact> contacts) {
		return service.savecontacts(contacts);
	}
}