package com.pluralsight.fundamentals.springmvc.service;

import com.pluralsight.fundamentals.entity.Application;

public interface ApplicationService {
    Iterable<Application> listApplications();
}
