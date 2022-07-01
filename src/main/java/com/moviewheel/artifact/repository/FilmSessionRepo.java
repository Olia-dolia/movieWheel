package com.moviewheel.artifact.repository;

import com.moviewheel.artifact.entity.FilmSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FilmSessionRepo extends JpaRepository<FilmSession, Long> {
    List<FilmSession> findByGenre(String filter);
    Optional<FilmSession> findById(Long id);
}
