package com.example.ecommerce.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Locked;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
    private String error;
    private String details;
    private LocalDateTime timestamp;
}
