package com.pluralsight.fundamentals.springrest.service;

import com.pluralsight.fundamentals.entity.Release;
import com.pluralsight.fundamentals.repository.ReleaseRepository;
import com.pluralsight.fundamentals.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReleaseServiceImp implements ReleaseService {

    @Autowired
    ReleaseRepository releaseRepository;

    @Override
    public List<Release> listReleases() {
        return (List<Release>) releaseRepository.findAll();
    }

    @Override
    public Release findRelease(long id) {
        Optional<Release> optionalRelease = releaseRepository.findById(id);

        if(optionalRelease.isPresent())
            return optionalRelease.get();
        throw new ApplicationNotFoundException("Release Not Found");
    }
}
