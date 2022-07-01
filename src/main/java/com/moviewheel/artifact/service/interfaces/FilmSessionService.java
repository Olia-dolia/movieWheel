package com.moviewheel.artifact.service.interfaces;

import com.moviewheel.artifact.entity.FilmSession;
import com.moviewheel.artifact.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FilmSessionService {
    FilmSession minusOneFreePlace(FilmSession fs);
    Optional<FilmSession> findById(Long id);
    void setFSTicket(FilmSession fs, Ticket ticket);
}
