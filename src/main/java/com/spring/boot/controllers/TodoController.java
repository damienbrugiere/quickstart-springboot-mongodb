package com.spring.boot.controllers;
import com.spring.boot.beans.Test;
import com.spring.boot.repositories.TestRepository;
import com.spring.boot.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TestService testService;
    @RequestMapping(value="", method = RequestMethod.GET )
    public List<Test> test(){
        return testService.findAll();
    }

    @RequestMapping(value="", method = RequestMethod.POST )
    public Test test(@RequestBody Test t) throws IllegalArgumentException{
        return testService.save(t);
    }
}
