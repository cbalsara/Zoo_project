package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public abstract class Animal {

            private Enum type;
            private String specie;


        public Animal(Enum type, String specie) {
            this.type = type;
            this.specie = specie;
        }

        public Enum getType(){
            return this.type;
        }

        public String getSpecie(){
            return this.specie;
        }

}


