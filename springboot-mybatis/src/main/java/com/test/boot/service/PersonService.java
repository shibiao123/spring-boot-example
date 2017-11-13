package com.test.boot.service;

import com.test.boot.dto.Person;

public interface PersonService {
    Person selectByPrimaryKey(Integer id);

    public void savePerson(Person person) throws Exception ;
}
