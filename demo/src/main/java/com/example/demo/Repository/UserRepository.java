package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.User;

@RestController
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
