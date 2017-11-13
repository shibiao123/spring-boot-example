package com.test.boot.service.impl;

import com.test.boot.dao.PersonMapper;
import com.test.boot.dto.Person;
import com.test.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;
    @Override
    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
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
        if(1 == 1){
//            throw new Exception("抛出异常了");
//            throw new IllegalAccessException("非法异常");
            throw new RuntimeException("运行异常");
        }
    }
}
