package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.FELINE;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class TigerTest {

    Tiger tiger;
    Food food;

    @Before
    public void before(){
        tiger = new Tiger(FELINE, "", "Tony", 40);
        food = new Food();
    }

    @Test
    public void testingHasType(){
        assertEquals( FELINE, tiger.getType() );
    }

    @Test
    public void testingSpecieType(){
        assertEquals( "Cat", tiger.getSpecie() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Tony", tiger.hasName() );
    }

    @Test
    public void testingHasAnAge(){
        assertEquals( 40, tiger.hasAnAge() );
    }


    //    empty stomach starts
    @Test
    public void stomachIsEmpty(){
        assertEquals(0, tiger.foodEaten());
    }

    //    can eat food
    @Test
    public void canEatFood(){
        tiger.feedAnimal(food);
        assertEquals(1, tiger.foodEaten() );
    }

    //        full stomach
    @Test
    public void stomachIsFull(){
        for (int f = 0; f < 20; f++){
            tiger.feedAnimal(food);
        }
        assertEquals(tiger.stomachFull(), true);
    }


    //    cant eat once full belly
    @Test
    public void cantEatWhenFull() {
        for (int f = 0; f < 30; f++) {
            tiger.feedAnimal(food);
        }
        assertEquals( tiger.foodEaten(), 20);
    }


    //    stomach can be emptied
    @Test
    public void canGoToToilet(){
        tiger.feedAnimal(food);
        tiger.goToToilet();
        assertEquals( 0, tiger.foodEaten() );
    }

    @Test
    public void testCanPurr(){
        assertEquals( "purrrrr", tiger.purr() );
    }

}
