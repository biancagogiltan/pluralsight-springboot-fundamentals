package com.pluralsight.fundamentals.springrest.service;

import com.pluralsight.fundamentals.entity.Release;

import java.util.List;

public interface ReleaseService {
    List<Release> listReleases();
    Release findRelease(long id);
}
