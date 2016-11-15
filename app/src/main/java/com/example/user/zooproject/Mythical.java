package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public abstract class Mythical extends Animal {


    public Mythical(Enum type, String specie){
        super(type, specie);

        this.type = AnimalType.MYTHICAL;
        this.specie = "Legendary";
    }

    public Enum AnimalType(){
        return this.type;
    }

    public String getSpecie(){
        return this.specie;
    }

}
