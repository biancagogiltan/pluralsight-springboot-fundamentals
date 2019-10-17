package com.pluralsight.fundamentals.springrest.service;

import com.pluralsight.fundamentals.entity.Ticket;
import com.pluralsight.fundamentals.repository.TicketRepository;
import com.pluralsight.fundamentals.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public Ticket findTicket(long id) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);

        if (optionalTicket.isPresent())
            return optionalTicket.get();
        else
            throw new ApplicationNotFoundException("Ticket not found Exception");
    }
}
