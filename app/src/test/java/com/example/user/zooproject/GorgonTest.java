package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class GorgonTest {

    Gorgon gorgon;

    @Before
    public void before(){
        gorgon = new Gorgon(animalType.MYTHICAL, "", "Gillian", 600000, false);
    }

    @Test
    public void testingAnimalType(){
        assertEquals( "Carnivore", gorgon.getType() );
    }

    @Test
    public void testingAnimalSpecie(){
        assertEquals( "Mythical", gorgon.getSpecie() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Gillian", gorgon.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 600000, gorgon.hasAge() );
    }

    @Test
    public void testingHasBeenFed(){
        assertEquals( false, gorgon.hasBeenFed() );
    }

    @Test
    public void testCanScreech(){
        assertEquals( "wailing", gorgon.screech() );
    }






}
