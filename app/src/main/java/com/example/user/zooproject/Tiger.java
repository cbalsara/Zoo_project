package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public class Tiger extends Feline implements Purrable {

    private String name;
    private int age;
    private Food[] stomach;

    public Tiger(Enum type, String specie, String name, int age){

        super(type, specie);

        this.name = name;
        this.age = age;
        this.stomach = new Food[20];

    }

    public String hasName(){
        return this.name;
    }

    public int hasAnAge(){
        return this.age;
    }

    //check to see how much food consumed
    public int foodEaten(){
        int counter = 0;
//        this will create 20 "null" spaces in our array food
        for(int food = 0; food < stomach.length; food++){
//            this will populate the "null space" by one + the number from previous time, each time
            if (stomach[food] != null) counter += 1;
        }
        return counter;
    }
    //actually feed the animal
    public void feedAnimal(Food someFood){
        if( stomachFull() ){
            return;
        }
        int fillFood = foodEaten();
        stomach[fillFood] = someFood;
    }

    //    Make sure that the animal can not eat excess food
    public boolean stomachFull(){
        return foodEaten() == stomach.length;
    }

    //    make sure that the animals stomach can be emptied
    public void goToToilet(){
        for (int food = 0; food < stomach.length; food++){
            stomach[food] = null;
        }
    }

    public String purr(){
        return "purrrrr";
    }

}
