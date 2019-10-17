package com.pluralsight.fundamentals.springmvc.web;

import com.pluralsight.fundamentals.springmvc.service.ApplicationService;
import com.pluralsight.fundamentals.springmvc.service.ReleaseService;
import com.pluralsight.fundamentals.springmvc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzaController {
    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @GetMapping("/applications")
    public String retrieveApplications(Model model) {
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/tickets")
    public String retrieveTickests(Model model) {
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }
}