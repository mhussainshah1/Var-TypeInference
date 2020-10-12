package com.company.var;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Guideline2 {

    public static void main(String[] args) {
        var stringList = new HashSet<String>();//ArrayList<String>();

        // ... 100 lines of code ...

        stringList.add("MUST_BE_PROCESSED_LAST");

        for (var string : stringList) {
            System.out.println(string);
        }
    }
}
