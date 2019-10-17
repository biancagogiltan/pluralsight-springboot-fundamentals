package com.pluralsight.fundamentals.springrest.service;

import com.pluralsight.fundamentals.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> listTickets();
    Ticket findTicket(long id);
}
