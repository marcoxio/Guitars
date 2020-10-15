package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Location;
import com.pluralsight.datarest.psguitar.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ModelRepository {

    @Autowired
    private ModelJpaRepository modelJpaRepository;

    /**
     * Create
     */
    public Model create(Model mod) {
        return modelJpaRepository.saveAndFlush(mod);
    }

    /**
     * Update
     */
    public Model update(Model mod) {
        return modelJpaRepository.saveAndFlush(mod);
    }

    /**
     * Delete
     */
    public void delete(Model mod) {
        modelJpaRepository.delete(mod);
    }

    /**
     * Find
     */
    public Model find(Long id) {
        return modelJpaRepository.getOne(id);
    }

    /**
     * List
     */
    public List<Model> list() {
        return modelJpaRepository.findAll();
    }
}
