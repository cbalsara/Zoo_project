package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public abstract class Feline extends Animal {

    private Enum type;
    private String specie;

    public Feline(Enum type, String specie) {

        super(type, specie);

        this.type = AnimalType.FELINE;
        this.specie = "Cat";
    }

//    add in here a method that sets the type to "Carnivore" and the Specie to "Cat" for
//    all subclasses that inherit from this

    public Enum AnimalType(){
        return this.type;
    }

    public String getSpecie(){
        return this.specie;
   }


}
