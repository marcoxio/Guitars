package com.pluralsight.datarest.psguitar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "model_types")
public class ModelType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "model_type_id")
    private Long modelTypeId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "modelType",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Model> models;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getModelTypeId() {
        return modelTypeId;
    }

    public void setModelTypeId(Long modelTypeId) {
        this.modelTypeId = modelTypeId;
    }


}
