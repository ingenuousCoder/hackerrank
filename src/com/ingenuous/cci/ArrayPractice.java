package com.ingenuous.cci;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.math.*;

public class ArrayPractice {

    public static void main(String args[]){
        int[] array = {1,5,2,1,4,4,6,7,3,9};

        System.out.println(Arrays.toString(array));

        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);

        System.out.println(Arrays.toString(sortedArray));

        int locationArray = Arrays.binarySearch(sortedArray,0,5, 4);
        System.out.println("Key: 1 is found at:    "+locationArray);

        locationArray = Arrays.binarySearch(sortedArray, 4,8, 4);
        System.out.println("Key: 1 is found at:    "+locationArray);


    }


}
