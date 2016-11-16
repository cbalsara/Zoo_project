package com.example.user.zooproject;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class Nasgul extends Mythical implements Screechable {

        private String name;
        private int age;
        private ArrayList<Edible> stomach;

        public Nasgul(Enum type, String specie, String name, int age){

            super(type,specie);

            this.name = name;
            this.age = age;
            this.stomach = new ArrayList<Edible>();

        }

        public String hasName(){
            return this.name;
        }

        public int hasAge(){
            return this.age;
        }

    //check to see how much food consumed

        public int foodEaten() {
            return this.stomach.size();
        }

//    create an eat method
        public void eat(Edible foodType){
            this.stomach.add(foodType);

        }


        public String screech(){
            return "wailing";
        }

        public String getSpecie(){
            return "Legendary";
        }

    }

