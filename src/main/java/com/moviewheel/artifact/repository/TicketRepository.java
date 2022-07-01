package com.moviewheel.artifact.repository;

import com.moviewheel.artifact.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
