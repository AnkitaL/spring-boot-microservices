package com.springboot.ashel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ashel.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(long userId);

}
