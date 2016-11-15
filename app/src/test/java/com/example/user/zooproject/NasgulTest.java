package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.MYTHICAL;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class NasgulTest {

    Nasgul nasgul;

    @Before
    public void before(){
        nasgul = new Nasgul(MYTHICAL, "", "Bob", 10000);
    }

    @Test
    public void testingAnimalType(){
        assertEquals( MYTHICAL, nasgul.getType() );
    }

    @Test
    public void testingAnimalSpecie(){
        assertEquals( "Legendary", nasgul.getSpecie() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Bob", nasgul.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 10000, nasgul.hasAge() );
    }

    //    empty stomach starts
//    @Test


//    can eat food


//    cant eat once full belly

//    full stomach

//    stomach can be emptied

    @Test
    public void testCanScreech(){
        assertEquals( "wailing", nasgul.screech() );
    }




}
