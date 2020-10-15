package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationJPARepository extends JpaRepository<Location, Long> {
}
