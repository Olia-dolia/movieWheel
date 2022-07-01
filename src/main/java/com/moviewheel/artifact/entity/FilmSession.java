package com.moviewheel.artifact.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Date;
import java.util.*;
import java.util.zip.DataFormatException;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class FilmSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    //@DateTimeFormat
    private Date premiereDate;
    @Column(nullable = false)
    private Time sessionTime;
    @Column(nullable = false)
    private Integer price;
    @Column(nullable = false)
    private Integer freePlaces;
    @Column(nullable = false)
    private String genre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "filmSession")
    private List<Ticket> tickets;

    public FilmSession(String title, Date premiereDate,Time sessionTime, Integer price, String genre, Integer freePlaces){
        this.title = title;
        this.premiereDate = premiereDate;
        this.sessionTime = sessionTime;
        this.price = price;
        this.genre = genre;
        this.freePlaces = freePlaces;
    }
}
