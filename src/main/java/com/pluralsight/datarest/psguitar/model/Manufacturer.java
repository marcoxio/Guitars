package com.pluralsight.datarest.psguitar.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(name="FOUNDEDDATE")
    private Date foundedDate;

    @Column(name="AVERAGEYEARLYSALES")
    private BigDecimal averageYearlySales;
    private Boolean active;

    @ManyToOne
    private Location location;

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    public BigDecimal getAverageYearlySales() {
        return averageYearlySales;
    }

    public void setAverageYearlySales(BigDecimal averageYearlySales) {
        this.averageYearlySales = averageYearlySales;
    }

    public Long getId() {
        return id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
