package com.spring.boot.services;

import com.spring.boot.beans.Test;
import com.spring.boot.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by damien on 23/04/2016.
 */
@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Test> findAll(){
        return testRepository.findAll();
    }

    public Test save(Test test) throws IllegalArgumentException{
        if(testRepository.findOne(test.getId()) != null){
            throw new IllegalArgumentException("Ce test existe déjà");
        }
        testRepository.save(test);
        return test;
    }
}
