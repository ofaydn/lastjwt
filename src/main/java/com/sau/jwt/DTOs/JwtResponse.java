package com.sau.jwt.DTOs;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class JwtResponse {
    private String token;
    private Integer id;
    private String username;
    private String email;
    private String address;
    private List<String> roles;

    public JwtResponse(String token, Integer id, String username, String email, List<String> roles, String address) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.address = address;
    }
}
