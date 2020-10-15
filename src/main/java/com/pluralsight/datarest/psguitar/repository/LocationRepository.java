package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationRepository {

    @Autowired
    private LocationJPARepository locationJPARepository;

    /**
     * Create
     */
    public Location create(Location loc) {
        return locationJPARepository.save(loc);
    }

    /**
     * Update
     */
    public Location update(Location loc) {
       return locationJPARepository.saveAndFlush(loc);
    }

    /**
     * Delete
     */
    public void delete(Long loc) {
       locationJPARepository.getOne(loc);
    }

    /**
     * Find
     */
    public Location find(Long id) {
        return locationJPARepository.getOne(id);
    }

    /**
     * List
     */
    public List<Location> list() {
        return locationJPARepository.findAll();
    }
}
