package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {
}
