package com.edu.pe.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.edu.pe.entities.Authority;

import org.springframework.security.core.GrantedAuthority;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
