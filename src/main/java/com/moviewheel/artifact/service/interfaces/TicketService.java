package com.moviewheel.artifact.service.interfaces;

import com.moviewheel.artifact.entity.Ticket;
import com.moviewheel.artifact.payload.dto.TicketDto;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();

    Ticket createTicket(String username, Long fsId);

    void deleteTicket(Long id);
}
