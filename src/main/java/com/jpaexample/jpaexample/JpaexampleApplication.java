package com.jpaexample.jpaexample;

import java.util.List;

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
		// user.setName("Ravi Kumar");
		// user.setCity("Karachi");
		// user.setStatus("Android Developer");

		// userRepo.save(user);

		List<User> allUser = userRepo.getAllUsers();
		allUser.forEach(user1 -> System.out.println(user1.getName()));

		List<User> getUser = userRepo.getUser("Nisar Ahmed", "Karachi");
		getUser.forEach(user2 -> System.out.println(user2.getName() +" | "+ user2.getCity()));
	}

}
