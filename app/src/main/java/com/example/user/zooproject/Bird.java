package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public abstract class Bird extends Animal {

    private String type;
    private String specie;

    public Bird(String type, String specie){
        super(type, specie);

        this.type = "Omnivore";
        this.specie = "Bird";
    }

    public String animalType(){
        return this.type;
    }

    public String specieType(){
        return this.specie;
    }

}
