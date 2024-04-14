package com.example.drone_ops.controller;

import com.example.drone_ops.model.Site;
import com.example.drone_ops.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sites")
public class SiteController {

    @Autowired
    private SiteService siteService;

    // Endpoint to retrieve all sites
    @GetMapping
    public ResponseEntity<List<Site>> getAllSites() {
        List<Site> sites = siteService.getAllSites();
        return new ResponseEntity<>(sites, HttpStatus.OK);
    }

    // Endpoint to add a new site
    @PostMapping
    public ResponseEntity<Site> addSite(@RequestBody Site site) {
        Site newSite = siteService.addSite(site);
        return new ResponseEntity<>(newSite, HttpStatus.CREATED);
    }

    // Endpoint to update an existing site
    @PutMapping("/{id}")
    public ResponseEntity<Site> updateSite(@PathVariable String id, @RequestBody Site site) {
        Site updatedSite = siteService.updateSite(id, site);
        if (updatedSite != null) {
            return new ResponseEntity<>(updatedSite, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete a site
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSite(@PathVariable String id) {
        siteService.deleteSite(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}