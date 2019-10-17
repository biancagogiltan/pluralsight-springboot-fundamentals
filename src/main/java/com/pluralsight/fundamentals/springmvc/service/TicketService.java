package com.pluralsight.fundamentals.springmvc.service;

import com.pluralsight.fundamentals.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}
