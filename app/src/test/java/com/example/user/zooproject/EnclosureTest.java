package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static com.example.user.zooproject.animalType.BIRD;
import static com.example.user.zooproject.animalType.FELINE;
import static com.example.user.zooproject.animalType.MYTHICAL;
import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 14/11/2016.
 */

public class EnclosureTest {

    Enclosure felineEnclosure;
    Enclosure birdEnclosure;
    Enclosure mythicalEnclosure;


    @Before
    public void before(){
//        ArrayList<Feline> f =  new ArrayList<Feline>();
        felineEnclosure = new Enclosure(FELINE);

//        ArrayList<Bird> b = new ArrayList<Bird>();
        birdEnclosure = new Enclosure(BIRD);

//        ArrayList<Mythical> m = new ArrayList<Mythical>();
        mythicalEnclosure = new Enclosure(MYTHICAL);
    }

    @Test
    public void testFelineEnclosureCurrentlyEmpty(){
        assertEquals( 0, felineEnclosure.enclosureSize() );
    }

    @Test
    public void testAddToFelineEnclosure(){
        Tiger tiger = new Tiger(animalType.FELINE, "", "Tony", 10, true);
        Lion lion = new Lion(animalType.FELINE, "", "Timmaae", 4, true);
        Owl owl = new Owl(animalType.BIRD, "", "Woo", 4, true);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.addAnimal(lion);
//        this owl should not pass as the type is incorrect
        felineEnclosure.addAnimal(owl);
        assertEquals( 2, felineEnclosure.getAnimals().size() );
    }

    @Test
    public void testRemoveAnimalFromFelineEnclosure(){
        Tiger tiger = new Tiger(animalType.FELINE, "", "Tony", 10, true);
        Lion lion = new Lion(animalType.FELINE, "", "Timmaae", 4, true);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.addAnimal(lion);
        Animal theChosenAnimal = felineEnclosure.removeAnimal();
        assertEquals( felineEnclosure.enclosureSize(), 1 );
    }

    @Test
    public void testRemoveAllAnimalsFromFelineEnclosure(){
        Tiger tiger = new Tiger(animalType.FELINE, "", "Tony", 10, true);
        felineEnclosure.addAnimal(tiger);
        felineEnclosure.removeAllAnimals();
        assertEquals( felineEnclosure.enclosureSize(), 0 );
    }
}
