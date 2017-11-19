package com.test.boot.service.impl;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;
import com.test.boot.dao.PersonMapper;
import com.test.boot.dto.Person;
import com.test.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public Person selectByPrimaryKey(Integer id) {
        String key = "person_" + id;
        ValueOperations<String, Person> operations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            Person person = operations.get(key);
            System.out.println("从redis中获取person,key=" + key);
            return person;
        }
        Person person1 =  personMapper.selectByPrimaryKey(id);
        operations.set(key,person1,100, TimeUnit.SECONDS);
        System.out.println("从数据库中获取person，设置到redis中,key=" + key);
        return person1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    /**
     * 默认支持回滚的异常为RuntimeException
     * 当使用默认异常的时候
     * 1 如果为RuntimeException或者其子类被抛出都可以进行回滚
     * 2 Exception抛出时不进行回滚 因为他是RuntimeException的父类 更大 定义上不进行回滚
     *
     * 如果异常回滚类定为Exception
     * 所有Exception及其子类异常被抛出时  都会进行回滚
     *
     */
    public void savePerson(Person person) throws Exception {
        personMapper.insert(person);
    }

    @Override
    public void updateByPrimaryKeySelective(Person person) {
        personMapper.updateByPrimaryKeySelective(person);

        String key = "person_" + person.getId();
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            redisTemplate.delete(key);
            System.out.println("删除person，key=" + key);
        }
    }
}
