package com.moviewheel.artifact.service;

import com.moviewheel.artifact.entity.FilmSession;
import com.moviewheel.artifact.entity.Ticket;
import com.moviewheel.artifact.repository.FilmSessionRepo;
import com.moviewheel.artifact.service.interfaces.FilmSessionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class FilmSessionServiceImpl implements FilmSessionService {

    private final FilmSessionRepo filmSessionRepo;

    @Override
    public FilmSession minusOneFreePlace(FilmSession fs) {
        fs.setFreePlaces(fs.getFreePlaces() - 1);
        return filmSessionRepo.save(fs);
    }

    @Override
    public Optional<FilmSession> findById(Long id) {
        Optional<FilmSession> fs = Optional.of(filmSessionRepo.getById(id));
        return fs;
    }

    @Override
    public void setFSTicket(FilmSession fs, Ticket ticket) {
        fs.getTickets().add(ticket);
        filmSessionRepo.save(fs);
    }
}
