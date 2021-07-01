package com.pluralsight.datarest.psguitar.repository;

import com.pluralsight.datarest.psguitar.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(exported=false)
public interface LocationJPARepository extends JpaRepository<Location, Long> {
    List<Location> findByStateIgnoreCaseStartingWith(String stateName);
    Location findFirstByStateIgnoreCaseStartingWith(String stateName);
    List<Location> findByStateNotLikeOrderByStateAsc(String stateName);

    List<Location> findByStateIsOrCountryEquals(String value, String value2);
    List<Location> findByStateNot(String state);
}
