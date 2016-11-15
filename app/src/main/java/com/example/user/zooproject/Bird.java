package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public abstract class Bird extends Animal {


    public Bird(Enum type, String specie){

        super(type, specie);


        this.type = AnimalType.BIRD;

        this.specie = "Shag";

    }

    public Enum getType(){
        return this.type;
    }

    public String specieType(){
        return this.specie;
    }

}

