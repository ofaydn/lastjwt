package com.sau.jwt.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="username")
    private String username;


    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    //Customerdan gelenler
    @Column(name="address")
    private String address;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Rental> rental;
    //
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> role = new HashSet<>();


    public User(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}
