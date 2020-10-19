package com.pluralsight.datarest.psguitar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "models")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "model_id")
    private Long modelId;

    private String name;
    private BigDecimal price;
    private int frets;

    @Column(name = "wood_type")
    private String woodType;

    @Column(name = "year_first_made")
    private Date yearFirstMade;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn(name = "model_type_id")
    private ModelType modelType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getFrets() {
        return frets;
    }

    public void setFrets(int frets) {
        this.frets = frets;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Date getYearFirstMade() {
        return yearFirstMade;
    }

    public void setYearFirstMade(Date yearFirstMade) {
        this.yearFirstMade = yearFirstMade;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
