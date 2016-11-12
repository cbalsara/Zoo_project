package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class LionTest {


    Lion lion;

    @Before
    public void before(){
        lion = new Lion("Carnivore", "Cat", "Leo", 20, true);
    }

    @Test
    public void hasName(){
        assertEquals( "Leo", lion.hasName() );
    }




}
