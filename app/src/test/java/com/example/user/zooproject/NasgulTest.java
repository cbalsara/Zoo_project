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
    Adult adult;
    Child child;

    @Before
    public void before(){
        nasgul = new Nasgul(MYTHICAL, "", "Bob", 10000);
        adult = new Adult();
        child = new Child();
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


    @Test
    public void testCanScreech(){
        assertEquals( "wailing", nasgul.screech() );
    }

    @Test
    public void testCanEatChild(){
        nasgul.eat(child);
        assertEquals( 1, nasgul.foodEaten() );
    }

    @Test
    public void testCanEmptyStomach() {
        nasgul.eat(child);
        nasgul.eat(adult);
        nasgul.eat(adult);
        nasgul.digestFully();
        assertEquals(0, nasgul.foodEaten());
    }

    @Test
    public void testAdultExceptsImpendingDoom(){
        assertEquals( "Welp, im dead!", adult.cry() );
    }

    @Test
    public void testChildLosesIt(){
        assertEquals("efinugrihodfvnj", child.cry() );
    }


}
