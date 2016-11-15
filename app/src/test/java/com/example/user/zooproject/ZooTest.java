package com.example.user.zooproject;

import org.junit.Test;

import static com.example.user.zooproject.AnimalType.BIRD;
import static com.example.user.zooproject.AnimalType.FELINE;
import static com.example.user.zooproject.AnimalType.MYTHICAL;

/**
 * Created by user on 15/11/2016.
 */

public class ZooTest {

    Enclosure felineEnclosure;
    Enclosure birdEnclosure;
    Enclosure mythicalEnclosure;

    Tiger tiger;
    Lion lion;
    Eagle eagle;
    Owl owl;
    Gorgon gorgon;
    Nasgul nasgul;

    public void before(){

        felineEnclosure = new Enclosure(FELINE);
        birdEnclosure = new Enclosure(BIRD);
        mythicalEnclosure = new Enclosure(MYTHICAL);

        Tiger tiger = new Tiger(AnimalType.FELINE, "", "Tony", 10, true);
        Lion lion = new Lion(AnimalType.FELINE, "", "Timmaae", 4, false);
        Eagle eagle = new Eagle(AnimalType.BIRD, "", "Eddie", 300, false);
        Owl owl = new Owl(AnimalType.BIRD, "", "Woo", 4, true);
        Gorgon gorgon = new Gorgon(AnimalType.MYTHICAL, "", "Gerry", 40000, true);
        Nasgul nasgul = new Nasgul(AnimalType.MYTHICAL, "", "Nelly", 1000, false);
    }

    @Test








}
