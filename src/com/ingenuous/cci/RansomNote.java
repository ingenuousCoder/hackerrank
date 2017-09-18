package com.ingenuous.cci;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        HashMap<String, Integer> magazineHashMap = generateHashMap(magazine, m);
        HashMap<String, Integer> ransomHashMap =  generateHashMap(ransom, n);

        canReplicate(magazineHashMap, ransomHashMap);

    }

    static void canReplicate(HashMap<String, Integer> magazineHashMap, HashMap<String, Integer> ransomHashMap) {
        for(String key: ransomHashMap.keySet()){
            if(magazineHashMap.get(key)!=null) {
                if (ransomHashMap.get(key) > magazineHashMap.get(key)) {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    static HashMap<String, Integer> generateHashMap(String stringArray[], int arrayLength) {
        HashMap<String, Integer> hashMap = new HashMap();

        for(int i=0; i < arrayLength; i++){
            if(hashMap.get(stringArray[i].toLowerCase()) == null) {
                hashMap.put(stringArray[i].toLowerCase(), 1);
            }else {
                hashMap.put(stringArray[i].toLowerCase(), hashMap.get(stringArray[i])+1);
            }
        }
        return hashMap;
    }
}

