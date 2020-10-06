package com.studyspring.Contact.repository;

import com.studyspring.Contact.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer>  {
//    findByNameContaining la mot ham trong Spring Data JPA
    List<Contact> findByNameContaining(String term);


}
