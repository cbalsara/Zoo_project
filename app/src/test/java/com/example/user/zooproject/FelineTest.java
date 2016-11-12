package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class FelineTest {

    Feline feline;

    @Before
    public void before(){
        feline = new Feline("Carnivore", "Cat");
    }

    @Test
    public void animalType(){
        assertEquals( "Carnivore", feline.hasType() );
    }



}
