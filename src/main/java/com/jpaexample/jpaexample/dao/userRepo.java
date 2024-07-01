package com.jpaexample.jpaexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpaexample.jpaexample.entities.User;

public interface userRepo extends CrudRepository<User,Integer> {
    
}
