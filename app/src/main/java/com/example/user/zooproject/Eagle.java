package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public class Eagle extends Bird {

    private String name;
    private int age;
    private boolean fed;

    public Eagle(String type, String specie, String name, int age, boolean fed){

        super(type, specie);

        this.name = name;
        this.age = age;
        this.fed = fed;

    }

    public String hasName(){
        return this.name;
    }






}