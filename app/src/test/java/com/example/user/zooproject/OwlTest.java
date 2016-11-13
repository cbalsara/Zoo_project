package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class OwlTest {

    Owl owl;

    @Before
    public void before(){
        owl = new Owl("", "", "Olly", 100, true);
    }

    @Test
    public void testingHasType(){
        assertEquals( "Omnivore", owl.animalType() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Olly", owl.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 100, owl.hasAge() );
    }

    @Test
    public void testingIfEaten(){
        assertEquals( true, owl.hasEaten() );
    }














}
