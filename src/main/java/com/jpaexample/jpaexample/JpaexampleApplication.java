package com.jpaexample.jpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpaexample.jpaexample.dao.UserRepo;
import com.jpaexample.jpaexample.entities.User;

@SpringBootApplication
public class JpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaexampleApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);

		User user = new User();
		user.setName("Ravi Kumar");
		user.setCity("Karachi");
		user.setStatus("Android Developer");

		userRepo.save(user);

	}

}
