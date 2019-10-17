package com.pluralsight.fundamentals.springrest.service;

import com.pluralsight.fundamentals.entity.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}
