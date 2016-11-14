package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public class Lion extends Feline {

    private String name;
    private int age;
    private boolean fed;


    public Lion(String type, String specie, String name, int age, boolean fed) {

        super(type, specie);

        this.name = name;
        this.age = age;
        this.fed = fed;
    }

    public String hasName(){
        return this.name;
    }

    public int hasAge(){
        return this.age;
    }

    public boolean hasBeenFed(){
        return this.fed;
    }

    public String purr(){
        return "purrrrr";
    }

}

