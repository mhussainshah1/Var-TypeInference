package com.company.var;

import java.io.Serializable;
import java.util.function.Function;

public class NonDenotable {
    public static void main(String[] args) {
        //Anonymous Class
        var productInfo = new Object() {
            String name = "Apple";
            int total = 0;
        };
        System.out.println("name = " + productInfo.name + ", total = " + productInfo.total);


        //Intersection Type
//        (Function<Integer, Integer> & Serializable) action = (Function<Integer, Integer> & Serializable) i -> i + 1; //DOES NOT COMPILE

//        Function<Integer, Integer>  f = (Function<Integer, Integer> & Serializable) i -> i + 1;
//
//         Serializable s = (Function<Integer, Integer> & Serializable) i -> i + 1;

        var action = (Function<Integer, Integer> & Serializable) i -> i + 1;

    }
}
