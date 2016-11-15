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

    @Before
    public void before(){
        tiger = new Tiger(FELINE, "", "Tony", 40, false);
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

    @Test
    public void testingIfBeenFed(){
        assertEquals( false, tiger.hasBeenFed() );
    }

    @Test
    public void testCanPurr(){
        assertEquals( "purrrrr", tiger.purr() );
    }

}
