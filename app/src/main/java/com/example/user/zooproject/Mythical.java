package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

abstract public class Mythical extends Animal {

    private String type;
    private String specie;

    public Mythical(String type, String specie){
        super(type, specie);

        this.type = "Carnivore";
        this.specie = "Mythical";
    }

    public String getAnimalType(){
        return this.type;
    }

    public String getAnimalSpecie(){
        return this.specie;
    }








}
