package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.com.pluralsight.fundamentals.repository.ApplicationRepository;
import com.pluralsight.fundamentals.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicationServiceImp implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Iterable<Application> listApplications() {
        return applicationRepository.findAll();
    }
}
