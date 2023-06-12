package com.sau.jwt.DTOs;

import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    private String username;
    private String password;
    private String email;
    private String address;
    private Set<String> role;
}
