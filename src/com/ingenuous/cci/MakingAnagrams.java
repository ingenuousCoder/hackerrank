package com.ingenuous.cci;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int aNumChars[] = new int[26];
        int numberOfDeletionsRequired = 0;
        for(char c : first.toCharArray()){
            //Character a -> Int 97
            int index = c - 97;
            aNumChars[index]++;
            numberOfDeletionsRequired++;
        }

        for(char c : second.toCharArray()){
            int index = c - 97;
            if(aNumChars[index] == 0){
                numberOfDeletionsRequired++;
            }else {
                aNumChars[index]--;
                numberOfDeletionsRequired--;
            }
        }
        return numberOfDeletionsRequired;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
