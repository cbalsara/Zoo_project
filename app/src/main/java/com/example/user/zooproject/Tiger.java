package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public class Tiger extends Feline implements Purrable {

    private String name;
    private int age;
    private boolean fed;

    public Tiger(String type, String specie, String name, int age, boolean fed){

        super(type, specie);

        this.name = name;
        this.age = age;
        this.fed = fed;

    }

    public String hasName(){
        return this.name;
    }

    public int hasAnAge(){
        return this.age;
    }

    public boolean hasBeenFed(){
        return this.fed;
    }

    public String purr(){
        return "purrrrr";
    }

}
