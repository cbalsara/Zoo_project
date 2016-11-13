package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

abstract public class Feline extends Animal {

    private String type;
    private String specie;

    public Feline(String type,String specie) {

        super(type, specie);

        this.type = "Carnivore";
        this.specie = "Cat";
    }

//    add in here a method that sets the type to "Carnivore" and the Specie to "Cat"



    public String hasType(){
        return this.type;
    }

    public String hasSpecie(){
        return this.specie;
    }







}
