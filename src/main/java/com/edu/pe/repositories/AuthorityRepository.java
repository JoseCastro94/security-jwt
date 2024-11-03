package com.edu.pe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edu.pe.entities.*;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    public Authority findByName(String name);

}
