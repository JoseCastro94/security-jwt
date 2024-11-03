package com.edu.pe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class DTOUser {
    private Long id;
    private String userName; 
    private String password;

    private boolean enabled;

    private String authorities; 

}
