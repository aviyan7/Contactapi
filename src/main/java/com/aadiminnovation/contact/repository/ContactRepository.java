package com.aadiminnovation.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.aadiminnovation.contact.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
