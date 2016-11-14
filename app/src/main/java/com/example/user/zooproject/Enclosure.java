package com.example.user.zooproject;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class Enclosure {

    private ArrayList<Animal> animals;

    public Enclosure(){
        this.animals = new ArrayList<Animal>();
    }

    public int enclosureSize(){
        return this.animals.size();
    }

    public void addAnimal(Animal anAnimal){
        this.animals.add(anAnimal);
    }

//    method to actually get the arrayList of animals
    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }

//    remove an animal from the arrayList i.e. remove an animal from the enclosure
    public Animal removeAnimal(){
        if (enclosureSize() > 0){
            Animal theChosenAnimal = animals.remove(0);
            return theChosenAnimal;
        }
        return null;
    }

//    clear the entire arrayList i.e remove all animals from the  enclosure
    public void removeAllAnimals(){
        this.animals.clear();
    }

}















