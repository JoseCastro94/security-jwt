package com.edu.pe.services;

import com.edu.pe.dtos.DTOUser;
import com.edu.pe.entities.User;

public interface UserService {
    public User findByUsername(String username);
    public User findById(Long id);
    public User addUser(DTOUser dtoUser);
}
