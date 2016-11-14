package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 14/11/2016.
 */

public class EnclosureTest {

    Enclosure enclosure;


    @Before
    public void before(){
        enclosure = new Enclosure();
    }

    @Test
    public void testFelineEnclosureCurrentlyEmpty(){
        assertEquals( 0, enclosure.enclosureSize() );
    }

    @Test
    public void testAddToEnclosure(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        Lion lion = new Lion("", "", "Timmaae", 4, true);
        enclosure.addAnimal(tiger);
        enclosure.addAnimal(lion);
        assertEquals( 2, enclosure.getAnimals().size() );
    }


    @Test
    public void testRemoveAnimal(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        Lion lion = new Lion("", "", "Timmaae", 4, true);
        enclosure.addAnimal(tiger);
        enclosure.addAnimal(lion);
        Animal theChosenAnimal = enclosure.removeAnimal();
        assertEquals( enclosure.enclosureSize(), 1 );
    }

    @Test
    public void testRemoveAllAnimals(){
        Tiger tiger = new Tiger("", "", "Tony", 10, true);
        enclosure.addAnimal(tiger);
        enclosure.removeAllAnimals();
        assertEquals( enclosure.enclosureSize(), 0 );
    }
}
