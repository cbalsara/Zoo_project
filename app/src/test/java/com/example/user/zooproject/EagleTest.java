package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.BIRD;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class EagleTest {

    Eagle eagle;

    @Before
    public void before(){
        eagle = new Eagle(BIRD, "", "Evie", 5, true);
    }

    @Test
    public void testingAnimalSpecie(){
        assertEquals( "Shag", eagle.specieType() );
    }

    @Test
    public void testingAnimalType(){
        assertEquals(BIRD, eagle.AnimalType() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Evie", eagle.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 5, eagle.hasAge() );
    }

    @Test
    public void testingHasEaten(){
        assertEquals( true, eagle.hasBeenFed() );
    }

    @Test
    public void testCanFly(){
        assertEquals( "flapping", eagle.fly() );
    }







}
