package com.edu.pe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edu.pe.entities.*;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUserName(String username);

}
