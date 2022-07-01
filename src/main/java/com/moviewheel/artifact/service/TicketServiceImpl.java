package com.moviewheel.artifact.service;

import com.moviewheel.artifact.entity.FilmSession;
import com.moviewheel.artifact.entity.Ticket;
import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.repository.TicketRepository;
import com.moviewheel.artifact.repository.UserRepository;
import com.moviewheel.artifact.service.interfaces.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepo;
    private final UserRepository userRepo;
    private final FilmSessionServiceImpl fsServiceImpl;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepo.findAll();
    }

    @Override
    public Ticket createTicket(String username, Long fsId) {
        Ticket ticketToDb = new Ticket();
        ticketToDb.setAmount(1);

        FilmSession fs = fsServiceImpl.findById(fsId).get();
        fsServiceImpl.minusOneFreePlace(fs);
        ticketToDb.setTotalPrice(fs.getPrice());
        ticketToDb.setFilmSession(fs);

        User u = userRepo.findUserByUsername(username).get();
        ticketToDb.setUser(u);

        fsServiceImpl.setFSTicket(fs, ticketToDb);

        return ticketRepo.save(ticketToDb);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepo.deleteById(id);
    }
}
