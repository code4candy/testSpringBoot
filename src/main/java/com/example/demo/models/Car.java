package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Car {
    private int id;
    private String modell;

    @JsonCreator
    public Car(@JsonProperty("id") int id,
               @JsonProperty("modell") String modell) {
        this.id = id;
        this.modell = modell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}

