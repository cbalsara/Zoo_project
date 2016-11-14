package com.example.user.zooproject;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class Enclosure {

    private ArrayList<Animal> animals;
    private Enum animalType;

    public Enclosure(Enum animalType){
        this.animals = new ArrayList<Animal>();
        this.animalType = animalType;
    }

    public int enclosureSize(){
        return this.animals.size();
    }
//      method to add an animal to the animal arrayList
    public void addAnimal(Animal anAnimal) {
        //check if anAnimal is == this.animalType
        if (anAnimal.getType() == this.animalType) {
            this.animals.add(anAnimal);
        }
    }

//    method to return the arrayList of animals
    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }

//    method to remove an animal from the animal arrayList
    public Animal removeAnimal(){
        if (enclosureSize() > 0){
            Animal theChosenAnimal = animals.remove(0);
            return theChosenAnimal;
        }
        return null;
    }

//    method to remove all the animals from the animal arrayList
    public void removeAllAnimals(){
        this.animals.clear();
    }

}















