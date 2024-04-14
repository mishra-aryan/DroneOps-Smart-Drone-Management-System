package com.example.drone_ops.serviceImpl;


import com.example.drone_ops.model.Site;
import com.example.drone_ops.repository.SiteRepository;
import com.example.drone_ops.service.SiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    private SiteRepository siteRepository;

    @Override
    public List<Site> getAllSites() {
        return siteRepository.findAll();
    }

    @Override
    public Site addSite(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site updateSite(String id, Site site) {
        Site existingSite = siteRepository.findById(id).orElse(null);
        if (existingSite != null) {
            // Update existing site with new data
            existingSite.setSiteName(site.getSiteName());
            existingSite.setPosition(site.getPosition());
            // Update other fields as needed

            // Save and return updated site
            return siteRepository.save(existingSite);
        } else {
            return null; // Site not found
        }
    }

    @Override
    public void deleteSite(String id) {
        siteRepository.deleteById(id);
    }
}

