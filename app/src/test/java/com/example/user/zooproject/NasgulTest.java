package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class NasgulTest {

    Nasgul nasgul;

    @Before
    public void before(){
        nasgul = new Nasgul("", "", "Bob", 10000, false);
    }

    @Test
    public void testingAnimalType(){
        assertEquals( "Carnivore", nasgul.getAnimalType() );
    }

    @Test
    public void testingAnimalSpecie(){
        assertEquals( "Mythical", nasgul.getAnimalSpecie() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Bob", nasgul.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 10000, nasgul.hasAge() );
    }

    @Test
    public void testingHasBeenFed(){
        assertEquals( false, nasgul.hasBeenFed() );
    }

    @Test
    public void testCanScreech(){
        assertEquals( "wailing", nasgul.screech() );
    }




}
