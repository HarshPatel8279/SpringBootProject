package com.first.SpringBootProject.dao;

import com.first.SpringBootProject.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer>{

}
