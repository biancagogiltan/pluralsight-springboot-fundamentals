package com.pluralsight.fundamentals.com.pluralsight.fundamentals.repository;

import com.pluralsight.fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Application, Long> {
}
