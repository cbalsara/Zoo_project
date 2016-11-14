package com.example.user.zooproject;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class Enclosure {

    private ArrayList<Animal> animals;

    public Enclosure(ArrayList<Animal> animalList){
        this.animals = animalList;
    }

    public void addAnimal(Animal anAnimal){
        this.animals.add(anAnimal);
    }

    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }

//    remove an animal from the arrayList i.e. remove an animal from the enclosure
    public void removeAnimal(Animal anAnimal){
        this.animals.remove(2);
    }

//    clear the entire arrayList i.e remove all animals from the  enclosure
    public void removeAllAnimals(Animal allAnimals){
        this.animals.clear();
    }

}















