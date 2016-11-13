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
        gorgon = new Gorgon("", "", "Gillian", 600000, false);
    }

    @Test
    public void testingHasName(){
        assertEquals( "Gillian", gorgon.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 600000, gorgon.hasAge() );
    }






}
