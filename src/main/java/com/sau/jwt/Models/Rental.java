package com.sau.jwt.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="rent_date")
    private Date rentDate;
    @Column(name="return_date")
    private Date returnDate;
    @Column(name="is_returned", columnDefinition = "boolean default false")
    private boolean isReturned;
    @Column(name="is_deleted", columnDefinition = "boolean default false")
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="car_id", nullable = false)
    private Car car;
}

