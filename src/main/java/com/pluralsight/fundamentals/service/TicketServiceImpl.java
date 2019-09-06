package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.com.pluralsight.fundamentals.repository.TicketRepository;
import com.pluralsight.fundamentals.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
