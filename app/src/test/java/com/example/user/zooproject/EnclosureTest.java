package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

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
    public void testCatEnclosureSize(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        Lion lion = new Lion("", "", "Timmaae", 4, true);
//        Gorgon gorgon = new Gorgon("Carnivore", "Myth", "Gillian", 10000, false);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.addAnimal(lion);
        assertEquals( 3, felineEnclosure.getAnimals().size() );
    }

    @Test
    public void testRemoveAllAnimal(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.removeAllAnimals();
        assertEquals(felineEnclosure.size(), 0);


    }




    @Test
    public void testBirdEnclosureSize(){
        Eagle eagle = new Eagle("", "", "Eddie", 20, false);
        Owl owl = new Owl("", "", "Hooty", 100, true);
        birdEnclosure.addAnimal(eagle);
        birdEnclosure.addAnimal(owl);
        assertEquals(2, birdEnclosure.getAnimals().size() );
    }



}
