package com.pluralsight.datarest.psguitar.model;

import javax.persistence.*;
import javax.xml.stream.Location;
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

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="manufacturer_id")
    private List<Model> models = new ArrayList<>();

    @ManyToOne
    private Location headquarters;

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

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public Location getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Location headquarters) {
        this.headquarters = headquarters;
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
