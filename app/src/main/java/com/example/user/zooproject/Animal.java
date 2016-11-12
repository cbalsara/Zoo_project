package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public class Animal {
        private String name;
        private int age;
        private String type;
        private boolean fed;


        public Animal(String name, int age, String type, boolean fed) {
            this.name = name;
            this.age = age;
            this.type = type;
            this.fed = fed;
        }

        public String animalName(){
            return this.name;
        }

        public int animalAge(){
            return this.age;
        }

        public String animalType(){
            return this.type;
        }
    }

