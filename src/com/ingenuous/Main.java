package com.ingenuous;

import com.ingenuous.cci.Field;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("Key1", "Value1");
        int i =10;

        System.out.println(myMap.getOrDefault("Key1", "Not found"));
        myMap.put("Key2", new Integer(i).toString());


        Field F0 = new Field("DefaultField0", "String", null,null, null,"20");
        Field F1 = new Field("DefaultField1", "Float", null,null, null,"20");
        Field F2 = new Field("DefaultField2", "Double", null,null, null,"20");

        Field F3 = new Field("DefaultField0", "Integer", null,null, null,"20");
        Field F4 = new Field("DefaultField1", "Float", null,null, null,"20");

        if(F0.equals(F3)) {
            System.out.println("F0 equals F3");
        } else {
            System.out.println("F0 NOT equals F3");
        }


        if(F1.equals(F4)) {
            System.out.println("F1 equals F4");
        } else {
            System.out.println("F1 NOT equals F4");
        }


        if(F0.equals(F2)) {
            System.out.println("F0 equals F2");
        } else {
            System.out.println("F0 NOT equals F2");
        }


    }
}
