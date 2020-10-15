package com.pluralsight.datarest.psguitar.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private BigDecimal price;
    private int frets;

    @Column(name = "WOODTYPE")
    private String woodType;

    @Column(name = "YEARFIRSTMADE")
    private Date yearFirstMade;

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





    public Long getId() {
        return id;
    }
}
