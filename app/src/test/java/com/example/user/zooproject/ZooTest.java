package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.BIRD;
import static com.example.user.zooproject.AnimalType.FELINE;
import static com.example.user.zooproject.AnimalType.MYTHICAL;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class ZooTest {

    Zoo zoo;

    Enclosure felineEnclosure;
    Enclosure birdEnclosure;
    Enclosure mythicalEnclosure;

    @Before
    public void before(){

        zoo = new Zoo();

        felineEnclosure = new Enclosure(FELINE);
        birdEnclosure = new Enclosure(BIRD);
        mythicalEnclosure = new Enclosure(MYTHICAL);
    }

    @Test
    public void testZooEmpty(){
        assertEquals( 0, zoo.zooSize() );
    }

    @Test
    public void testAddEnclosure (){
        zoo.addEnclosure(felineEnclosure);
        assertEquals( 1, zoo.getEnclosures().size() );
    }

    @Test
    public void testRemoveEnclosure(){
        zoo.addEnclosure(felineEnclosure);
        zoo.addEnclosure(birdEnclosure);
        zoo.addEnclosure(mythicalEnclosure);
        zoo.removeEnclosure();
        assertEquals(2, zoo.getEnclosures().size() );
    }





}
