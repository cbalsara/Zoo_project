package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Tony", 20, "Feline", true);
    }

    @Test
    public void testAnimalName(){
        assertEquals( "Tony", animal.animalName() );
    }

    @Test
    public void testAnimalAge(){
        assertEquals( 20, animal.animalAge() );
    }

    @Test
    public void testAnimalType(){
        assertEquals( "Feline", animal.animalType() );
    }







}

