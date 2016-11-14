package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 14/11/2016.
 */

public class EnclosureTest {

    Enclosure felineEnclosure;
    Enclosure birdEnclosure;


    @Before
    public void before(){
        felineEnclosure = new Enclosure();
        birdEnclosure = new Enclosure();
    }

    @Test
    public void testFelineEnclosureCurrentlyEmpty(){
        assertEquals( 0, felineEnclosure.enclosureSize() );
    }

    @Test
    public void testFelineEnclosureSize(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        Lion lion = new Lion("", "", "Timmaae", 4, true);
//        Gorgon gorgon = new Gorgon("Carnivore", "Myth", "Gillian", 10000, false);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.addAnimal(lion);
        assertEquals( 2, felineEnclosure.getAnimals().size() );
    }

//    @Test
//    public void testBirdEnclosureSize(){
//        Eagle eagle = new Eagle("", "", "Eddie", 20, false);
//        Owl owl = new Owl("", "", "Hooty", 100, true);
//        birdEnclosure.addAnimal(eagle);
//        birdEnclosure.addAnimal(owl);
//        assertEquals(2, birdEnclosure.getAnimals().size() );
//    }

    @Test
    public void testRemoveAnimal(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        Lion lion = new Lion("", "", "Timmaae", 4, true);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.addAnimal(lion);
        Animal theChosenAnimal = felineEnclosure.removeAnimal();
        assertEquals(felineEnclosure.enclosureSize(), 1);

    }

    @Test
    public void testRemoveAllAnimals(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.removeAllAnimals();
        assertEquals( felineEnclosure.enclosureSize(), 0 );
    }
}
