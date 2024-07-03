package com.jpaexample.jpaexample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpaexample.jpaexample.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

    // Query is used in JPA if we want to write custom quries
    @Query("SELECT u FROM User u")
    public List<User> getAllUsers();

    @Query("SELECT u FROM User u WHERE u.name=:n AND u.city=:c")
    public List<User> getUser(@Param("n") String name, @Param("c") String city);

}
