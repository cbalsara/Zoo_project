package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public abstract class Mythical extends Animal {

    private Enum type;
    private String specie;

    public Mythical(Enum type, String specie){
        super(type, specie);

        this.type = animalType.MYTHICAL;
        this.specie = "Legendary";
    }

    public Enum animalType(){
        return this.type;
    }

    public String getSpecie(){
        return this.specie;
    }

}
