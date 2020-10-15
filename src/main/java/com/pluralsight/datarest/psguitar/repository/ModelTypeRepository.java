package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.ModelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ModelTypeRepository {

    @Autowired
    private ModelTypeJpaRepository modelTypeJpaRepository;

    /**
     * Create
     */
    public ModelType create(ModelType mt) {
        return modelTypeJpaRepository.saveAndFlush(mt);
    }

    /**
     * Update
     */
    public ModelType update(ModelType mt) {
        return modelTypeJpaRepository.saveAndFlush(mt);
    }

    /**
     * Delete
     */
    public void delete(Long mt) {
        modelTypeJpaRepository.getOne(mt);
    }

    /**
     * Find
     */
    public ModelType find(Long id) {
        return modelTypeJpaRepository.getOne(id);
    }

    /**
     * List
     */
    public List<ModelType> list() {
        return modelTypeJpaRepository.findAll();
    }
}
