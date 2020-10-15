package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.ModelType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelTypeJpaRepository extends JpaRepository<ModelType, Long> {
}
