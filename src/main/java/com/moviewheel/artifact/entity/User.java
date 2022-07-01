package com.moviewheel.artifact.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false, updatable = false)
    private String username;
    @Column (nullable = false)
    private String UserPassword;
    private String firstName;
    private String lastName;
    private String email;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Coupon> coupons;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Ticket> tickets;
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;
}
