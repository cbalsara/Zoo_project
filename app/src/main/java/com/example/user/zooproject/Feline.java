package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public class Feline extends Animal {


    public Feline(String name, int age, String type, boolean fed) {
        super(name, age, type, fed);
    }


    public String type(){
        return "Canine";
    }
}
