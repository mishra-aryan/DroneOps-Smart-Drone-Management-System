package com.example.drone_ops.service;

import com.example.drone_ops.model.Site;

import java.util.List;

public interface SiteService {
    List<Site> getAllSites();
    Site addSite(Site site);
    Site updateSite(String id, Site site);
    void deleteSite(String id);
}