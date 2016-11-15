package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.MYTHICAL;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class GorgonTest {

    Gorgon gorgon;

    @Before
    public void before(){
        gorgon = new Gorgon(MYTHICAL, "", "Gillian", 600000);
    }

    @Test
    public void testingAnimalType(){
        assertEquals( MYTHICAL, gorgon.getType() );
    }

    @Test
    public void testingAnimalSpecie(){
        assertEquals( "Legendary", gorgon.getSpecie() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Gillian", gorgon.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 600000, gorgon.hasAge() );
    }

    //    empty stomach starts
//    @Test


//    can eat food


//    cant eat once full belly

//    full stomach

//    stomach can be emptied

    @Test
    public void testCanScreech(){
        assertEquals( "wailing", gorgon.screech() );
    }






}
