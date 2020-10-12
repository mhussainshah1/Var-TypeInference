package com.company.var;

public class Guideline7 {
    public static void main(String[] args) {
        //No issue with Boolean, character, long, String and Floating Point
        var ready = true;//boolean
        var ch = '\ufffd';//char
        var sum = 0L;//long
        var label = "wombat";//String
        var f1 = 1.0f;//float
        var d1 = 3.0;//double

        //Whole number inferred as integer
        byte flags = 0;
        short mask = 0x7fff;
        long base = 17;

        var flags1 = 0; //int
        var mask1 = 0x7fff;//int
        var base1 = 17;//int
    }
}
