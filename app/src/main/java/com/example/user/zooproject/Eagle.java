package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public class Eagle extends Bird implements Flyable {

    private String name;
    private int age;
    private Food[] stomach;

    public Eagle(Enum type, String specie, String name, int age){

        super(type, specie);

        this.name = name;
        this.age = age;
        this.stomach = new Food[6];
    }

    public String hasName(){
        return this.name;
    }

    public int hasAge(){
        return this.age;
    }

    public int foodEaten(){
           int counter = 0;
        for(int f = 0; f < stomach.length; f++){
            if (stomach[f] != null) counter++;
        }
        return counter;
    }

    public String fly(){
        return "flapping";
    }

}
