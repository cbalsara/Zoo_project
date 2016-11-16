package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 16/11/2016.
 */

public class PublicTest {

    Practise newPractiseObject;

    @Before
    public void Before(){
        newPractiseObject = new Practise("Words",4, true);
    }

    @Test
    public void testPractiseWord(){
        assertEquals("Words", newPractiseObject.getTheWords() );
    }

    @Test
    public void testSetPractiseWord(){
         newPractiseObject.setTheWords("New String");
        assertEquals("New String", newPractiseObject.getTheWords() );
    }

    @Test
    public void TestIntCalled(){
        assertEquals( 4, newPractiseObject.getTheNumber() );
    }

    @Test
    public void testChangeNumber(){
        newPractiseObject.setTheNumber(500);
        assertEquals(500, newPractiseObject.getTheNumber() );
    }

}


