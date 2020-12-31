package com.first.SpringBootProject;

import com.first.SpringBootProject.dao.UserRepo;
import com.first.SpringBootProject.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

		UserRepo userRepo =  context.getBean(UserRepo.class);

//		User user = new User();
//
//		user.setName("Harsh");
//		user.setCity("Surat");
//		user.setStatus("I am Java Developer");
//
//		User user1 = userRepo.save(user);
//
//		System.out.println(user1);

//		Create User Object and add that in to

		/*

		User user = new User();

		user.setName("Swayam");
		user.setCity("Surat");
		user.setStatus("I want to become a Artist");

		User user2 = userRepo.save(user);

		System.out.println("Saved User is"+user2);

		User createuser1 = new User();

		createuser1.setName("Denish");
		createuser1.setCity("Surat");
		createuser1.setStatus("Python developer");

		User createUser2 = new User();

		createUser2.setName("Krish");
		createUser2.setCity("Surat");
		createUser2.setStatus("CA of the Year");

		List<User> users = List.of(createuser1,createUser2);

		Iterable<User> result =  userRepo.saveAll(users);

		for(User u : result){
			System.out.println(u);
		}


		 */

		// Update the Data

		Optional<User> optional = userRepo.findById(5);

		User findedUser = optional.get();

		findedUser.setStatus("Hey this is the CA");

		User updatedUser = userRepo.save(findedUser);

		System.out.println(updatedUser);

	}

}
