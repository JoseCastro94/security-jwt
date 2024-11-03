package com.edu.pe.services;

import com.edu.pe.entities.Authority;

public interface AuthorityService {
    public Authority findByName(String name);
    public Authority findById(Long id);
    public Authority addAuthority(Authority authority);
}
