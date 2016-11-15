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


//    getter method to get the enclosures
    public ArrayList<Enclosure> getEnclosures(){
        return this.newEnclosure;
    }

//        add enclosure to the zoo()
    public void addEnclosure(Enclosure anEnclosure){
        this.newEnclosure.add(anEnclosure);
    }

//    remove an enclosure from the zoo()
    public Enclosure removeEnclosure(){
        if(zooSize() > 0){
            Enclosure specificEnclosure = newEnclosure.remove(0);
            return specificEnclosure;
        }
        return null;
    }




//    add animal()



//    remove animal()




//    feed animal()




}
