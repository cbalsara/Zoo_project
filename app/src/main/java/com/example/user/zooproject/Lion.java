package com.example.user.zooproject;

/**
 * Created by user on 12/11/2016.
 */

public class Lion extends Feline implements Purrable {

    private String name;
    private int age;
    private Food[] stomach;


    public Lion(Enum type, String specie, String name, int age) {

        super(type, specie);

        this.name = name;
        this.age = age;
        this.stomach = new Food [25];
    }

    public String hasName(){
        return this.name;
    }

    public int hasAge(){
        return this.age;
    }

    //check to see how much food consumed
    public int foodEaten() {
        int foodEatenCount = 0;

        for (Food eatenFood : stomach) {
            if (eatenFood != null) {
                foodEatenCount++;
            }
        }
        return foodEatenCount;
    }
                                    //    25
//        for (int index = 0; index < stomach.length; index++) {
//            if (stomach[index] != null) {
//                foodEatenCount = foodEatenCount + 1; // foodEatenCount++
//            }
//        }
//        return foodEatenCount;
//    }

    //actually feed the animal
    public void feedAnimal(Food food){
        if( stomachFull() ){
            return;
        }
        //    0   ,    1   ,  2
//        [oldFood, oldFood, null....]
        // nextFreeIndex  = 2
        int nextFreeIndex = foodEaten();
        //           2
        stomach[nextFreeIndex] = food;
//        [oldFood, oldFood, newFood, null....]
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

