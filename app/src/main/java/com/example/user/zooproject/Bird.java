package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public abstract class Bird extends Animal {

    private Enum type;
    private String specie;

    public Bird(Enum type, String specie){
        super(type, specie);

        this.type = AnimalType.BIRD;
        this.specie = "Shag";
    }

    public Enum AnimalType(){
        return this.type;
    }

    public String specieType(){
        return this.specie;
    }

}
