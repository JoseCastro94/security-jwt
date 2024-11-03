package com.edu.pe.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ErrorMessage {
    private Integer status;
    private String exception;
    private String message;
    private String uri;  //uri
    private LocalDateTime timestamp;
}
