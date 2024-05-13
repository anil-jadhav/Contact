package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.binding.Contact;
@Repository
public interface ContactRepositoy extends JpaRepository<Contact, Integer> {

}
