package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class EnclosureTest {

    Enclosure catEnclosure;

    @Before
    public void before(){
        catEnclosure = new Enclosure();
    }

    @Test
    public void testEnclosureSize(){
        Tiger tiger = new Tiger("Carnivore", "Cat", "Tony", 10, true);
//        Gorgon gorgon = new Gorgon("Carnivore", "Myth", "Gillian", 10000, false);
        catEnclosure.addAnimal(tiger);
//        catEnclosure.addAnimal(gorgon);
        assertEquals( 1, catEnclosure.getAnimals().size() );
    }



}
