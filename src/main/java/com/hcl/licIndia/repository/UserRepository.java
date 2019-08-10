package com.hcl.licIndia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.licIndia.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
