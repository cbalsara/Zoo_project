package com.example.user.zooproject;

/**
 * Created by user on 13/11/2016.
 */

public class Nasgul extends Mythical implements Screechable {

        private String name;
        private int age;
        private Food[] stomach;

        public Nasgul(Enum type, String specie, String name, int age, boolean fed){

            super(type,specie);

            this.name = name;
            this.age = age;
            this.stomach = new Food[100000];

        }

        public String hasName(){
            return this.name;
        }

        public int hasAge(){
            return this.age;
        }

    //check to see how much food consumed
    public int foodEaten(){
        int counter = 0;
        for(int Food = 0; Food < stomach.length; Food++){
            if (stomach[Food] != null) counter++;
        }
        return counter;
    }
    //actually feed the animal
    public void FeedAnimal(Food food){
        if( stomachFull() ){
            return;
        }
        int fillFood = foodEaten();
        stomach[fillFood] = food;
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

        public String screech(){
            return "wailing";
        }

        public String getSpecie(){
            return "Legendary";
        }

    }

