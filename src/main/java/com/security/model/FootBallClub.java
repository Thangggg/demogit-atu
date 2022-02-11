package com.security.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FootBallClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private long w;
    private long d;
    private long l;

    @ManyToOne
    private User user;
}
