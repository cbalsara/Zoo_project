package com.example.user.zooproject;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class Zoo {

    private ArrayList<Enclosure> newEnclosure;

    public Zoo(){
        this.newEnclosure = new ArrayList<Enclosure>();
    }

    public int zooSize(){
        return this.newEnclosure.size();
    }


    public ArrayList<Enclosure> getEnclosures(){
        return this.newEnclosure;
    }

//        add enclosure to the zoo()
    public void addEnclosure(Enclosure anEnclosure){
        this.newEnclosure.add(anEnclosure);
    }

//    remove an enclosure from the zoo()



//    add animal()



//    remove animal()




//    feed animal()




}
