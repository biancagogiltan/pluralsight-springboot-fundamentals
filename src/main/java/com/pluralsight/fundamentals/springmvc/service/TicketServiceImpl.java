package com.pluralsight.fundamentals.springmvc.service;

import com.pluralsight.fundamentals.repository.TicketRepository;
import com.pluralsight.fundamentals.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.LinkedList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    List d = new LinkedList();

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
