package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public abstract class Animal {

            private String type;
            private String specie;


        public Animal(String type, String specie) {
            this.type = type;
            this.specie = specie;
        }

        public String animalType(){
            return this.type;
        }

        public String animalSpecie(){
            return this.specie;
        }

}


