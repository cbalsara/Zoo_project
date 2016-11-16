package com.example.user.zooproject;

/**
 * Created by user on 15/11/2016.
 */

public class Practise {

// we are actually creating variables below here which will belong to the practise class.
// Inside the class 'practise' will be a set space for a string of 'words' object,
// an integar of 'numbers' object' and a boolean of 'statement' object
    public String words;
    public int numbers;
    public boolean statement;

//    here we have the constructor, which actually assigns the above variables to
// the practise class, so that when a new object of practise is called,
// it will come with the parameters)
//    we have assigned .words to typesofWords below
    public Practise(String typesOfWords, int numberOfNumbers, boolean trueOrFalseStatement){
        this.words = typesOfWords;
        this.numbers = numberOfNumbers;
        this.statement = trueOrFalseStatement;
    }

//    getter to get the string of whatever we put into .words
    public String getTheWords(){
        return this.words;
    }
//setter to now set .word to whatever we choose to.
    public void setTheWords(String newWordsToSet){
        this.words = newWordsToSet;
    }




}
