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
        for(int Food = 0; Food < stomach.length; Food++){
            if (stomach[Food] != null) counter++;
        }
        return counter;
    }

    public void FeedAnimal(Food food){
        if( stomachFull() ){
            return;
        }
        int fillFood = foodEaten();
        stomach[fillFood] = food;
    }

    public boolean stomachFull(){
        return foodEaten() == stomach.length;
    }

    public void goToToilet(){
        for (int food = 0; food < stomach.length; food++){
            stomach[food] = null;
        }
    }

    public String fly(){
        return "flapping";
    }

}
