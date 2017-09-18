package com.ingenuous.cci;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IcecreamProblem {

    public static int getIndex(int a[], int value, int excludeThis){
        for(int ctr=0; ctr < a.length; ctr++){
            if(a[ctr] == value && ctr != excludeThis){
                return ctr;
            }
        }
        return -1;
    }

    public static int[] getIndicesFromValues(int a[], int lookupValue, int complement){
        int index1 = getIndex(a, lookupValue,-1)+1;
        int index2 = getIndex(a, complement, index1-1)+1;
        int indices[] = {Math.min(index1, index2), Math.max(index1, index2)};
        return indices;
    }

    public static int[] getFlavorIds(int a[], int n, int money){
        int sortedArray[] = a.clone();
        Arrays.sort(sortedArray);

        for(int sortCtr=0; sortCtr < sortedArray.length; sortCtr++){
            int complement = money - sortedArray[sortCtr];
            int location = Arrays.binarySearch(sortedArray, sortCtr+1, sortedArray.length, complement);
            if(location >= 0 && location < sortedArray.length && sortedArray[location] == complement) {
                int[] indices = getIndicesFromValues(a, sortedArray[sortCtr], complement);
                return indices;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int flavorIds[] = getFlavorIds(a, n, money);
            System.out.println(Arrays.toString(flavorIds));
        }

    }
}

