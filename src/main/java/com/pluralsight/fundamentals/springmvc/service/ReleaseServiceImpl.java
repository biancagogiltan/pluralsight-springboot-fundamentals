package com.pluralsight.fundamentals.springmvc.service;

import com.pluralsight.fundamentals.repository.ReleaseRepository;
import com.pluralsight.fundamentals.entity.Release;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }
}
