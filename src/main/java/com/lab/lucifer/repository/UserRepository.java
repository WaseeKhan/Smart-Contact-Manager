package com.lab.lucifer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lab.lucifer.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
