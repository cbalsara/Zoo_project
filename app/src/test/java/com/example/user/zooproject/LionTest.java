package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.FELINE;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class LionTest {


    Lion lion;
    Food food;

    @Before
    public void before(){
        lion = new Lion(FELINE, "", "Leo", 20);
        food = new Food();
    }


    @Test
    public void testingAnimalType(){
        assertEquals( FELINE, lion.getType() );
    }

    @Test
    public void testingAnimalSpecie(){
        assertEquals( "Cat", lion.getSpecie() );
    }


    @Test
    public void testingHasName(){
        assertEquals( "Leo", lion.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 20, lion.hasAge() );
    }

    //    empty stomach starts
    @Test
    public void stomachIsEmpty(){
        assertEquals(0, lion.foodEaten());
    }


//    can eat food


//    cant eat once full belly

//    full stomach

//    stomach can be emptied

    @Test
    public void testPurr(){
        assertEquals( "purrrrr", lion.purr() );
    }







}
