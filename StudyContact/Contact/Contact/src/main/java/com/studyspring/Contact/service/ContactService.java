package com.studyspring.Contact.service;

import com.studyspring.Contact.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
//  Lay ra tat ca phan tu
    Iterable<Contact> findAll();
//  lay ra object theo ten
    List<Contact> search(String term);
//  Lay ra 1 object theo id
    Optional<Contact> findOne(Integer id);
//   Luu 1 object
    void save(Contact contact);
//    xoa 1 object
    void delete(Integer id);

}
