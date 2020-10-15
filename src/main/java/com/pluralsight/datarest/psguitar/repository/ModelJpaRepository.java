package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ModelJpaRepository extends JpaRepository<Model, Long> {
}
