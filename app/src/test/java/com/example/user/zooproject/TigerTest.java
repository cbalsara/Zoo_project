package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class TigerTest {

    Tiger tiger;

    @Before
    public void before(){
        tiger = new Tiger("", "", "Tony", 40, false);
    }

    @Test
    public void testingHasName(){
        assertEquals( "Tony", tiger.hasName() );
    }











}
