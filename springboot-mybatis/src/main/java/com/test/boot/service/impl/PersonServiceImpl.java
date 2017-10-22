package com.test.boot.service.impl;

import com.test.boot.dao.PersonMapper;
import com.test.boot.dto.Person;
import com.test.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;
    @Override
    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
