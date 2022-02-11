package com.security.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tournaments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToOne
    private FootBallClub footBallClub;
}
