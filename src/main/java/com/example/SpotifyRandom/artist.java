package com.example.SpotifyRandom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class artist {

    @Id
    @GeneratedValue
    private long id;

    private String artistName;
    private String firstName;

}
