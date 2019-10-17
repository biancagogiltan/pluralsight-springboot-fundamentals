package com.pluralsight.fundamentals.springmvc.service;

import com.pluralsight.fundamentals.entity.Release;

public interface ReleaseService {
    Iterable<Release> listReleases();
}
