package com.pluralsight.datarest.psguitar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy = "location",targetEntity = Manufacturer.class,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Manufacturer> manufacturers;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return locationId;
    }

    public void setId(Long id) {
        this.locationId = id;
    }


}
