package com.example.user.zooproject;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class Enclosure {

    private ArrayList<Animal> animals;

    public Enclosure(ArrayList<Animal> animalList) {
        this.animals = animalList;
    }

    public void addAnimal(Animal anAnimal){
        this.animals.add(anAnimal);
    }

    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }


}















