package com.pluralsight.datarest.psguitar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manufacturer_id")
    private Long manufacturerId;

    @Column(name = "name")
    private String name;

    @Column(name="founded_date")
    private Date foundedDate;

    @Column(name="average_yearly_sales")
    private BigDecimal averageYearlySales;
    private Boolean active;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Model> models;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public void setId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
