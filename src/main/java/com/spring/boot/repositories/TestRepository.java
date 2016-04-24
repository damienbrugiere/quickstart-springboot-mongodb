package com.spring.boot.repositories;

import com.spring.boot.beans.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * Created by damien on 23/04/2016.
 */
public interface TestRepository extends MongoRepository<Test,String>{
}
