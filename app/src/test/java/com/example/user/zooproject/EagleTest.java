package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class EagleTest {

    Eagle eagle;

    @Before
    public void before(){
        eagle = new Eagle("", "", "Evie", 5, true);
    }

    @Test
    public void testingHasName(){
        assertEquals( "Evie", eagle.hasName() );
    }







}
