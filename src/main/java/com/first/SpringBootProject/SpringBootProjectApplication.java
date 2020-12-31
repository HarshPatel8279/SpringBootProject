package com.first.SpringBootProject;

import com.first.SpringBootProject.dao.UserRepo;
import com.first.SpringBootProject.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

		UserRepo userRepo =  context.getBean(UserRepo.class);

		User user = new User();

		user.setName("Harsh");
		user.setCity("Surat");
		user.setStatus("I am Java Developer");

		User user1 = userRepo.save(user);

		System.out.println(user1);


	}

}
