package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ManufacturerRepository {

    @Autowired
    private ManufacturerJpaRepository manufacturerJpaRepository;

    /**
     * Create
     */
    public Manufacturer create(Manufacturer man) {
        return manufacturerJpaRepository.saveAndFlush(man);
    }

    /**
     * Update
     */
    public Manufacturer update(Manufacturer man) {
        return manufacturerJpaRepository.saveAndFlush(man);
    }

    /**
     * Delete
     */
    public void delete(Manufacturer man) {
        manufacturerJpaRepository.delete(man);
    }

    /**
     * Find
     */
    public Manufacturer find(Long id) {
        return manufacturerJpaRepository.getOne(id);
    }

    /**
     * List
     */
    public List<Manufacturer> list() {
        return manufacturerJpaRepository.findAll();
    }



}
