package com.example.ecommerce.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SignupRequest {
    private String email;
    private String fullName;
    private String otp;
}
