package com.example.user.zooproject;

import org.junit.Before;
import org.junit.Test;

import static com.example.user.zooproject.AnimalType.BIRD;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class OwlTest {

    Owl owl;

    @Before
    public void before(){
        owl = new Owl(BIRD, "", "Olly", 100);
    }

    @Test
    public void testingHasType(){
        assertEquals( BIRD, owl.getType() );
    }

    @Test
    public void testingSpecieKind(){
        assertEquals( "Shag", owl.specieType() );
    }

    @Test
    public void testingHasName(){
        assertEquals( "Olly", owl.hasName() );
    }

    @Test
    public void testingHasAge(){
        assertEquals( 100, owl.hasAge() );
    }

    //    empty stomach starts
//    @Test


//    can eat food


//    cant eat once full belly

//    full stomach

//    stomach can be emptied

    @Test
    public void testCanFly(){
        assertEquals( "flapping", owl.fly() );
    }


}
