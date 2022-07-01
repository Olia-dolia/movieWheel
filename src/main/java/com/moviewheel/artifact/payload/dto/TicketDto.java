package com.moviewheel.artifact.payload.dto;

import com.moviewheel.artifact.entity.FilmSession;
import com.moviewheel.artifact.entity.User;
import lombok.Data;


@Data
public class TicketDto {
    private Integer totalPrice;
    private Integer amount;
    private FilmSession filmSession;
    private User user;
}
