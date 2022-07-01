package com.moviewheel.artifact.payload.dto;

import com.moviewheel.artifact.entity.Ticket;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;

@Data
public class FilmSessionDto {
    @NotNull
    @NotEmpty
    private String title;
    @NotNull
    @NotEmpty
    private Date premiereDate;
    @NotNull
    @NotEmpty
    private Time sessionTime;
    @NotNull
    @NotEmpty
    private Integer price;
    @NotNull
    @NotEmpty
    private Integer freePlaces;
    @NotNull
    @NotEmpty
    private String genre;

    private Set<Ticket> tickets;
}
