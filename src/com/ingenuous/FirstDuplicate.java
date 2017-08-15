package com.ingenuous;

import static java.lang.Math.abs;

/**
 * Created by Alpeshk on 8/8/2017.
 */
public class FirstDuplicate {

    public static int firstDuplicate(int[] a) {
        for(int i =0; i < a.length; i++) {
            if(a[abs(a[i])] < 0) {
                return i+1;
            }else {
                if(abs(a[i]) < a.length)
                    a[abs(a[i])] = a[abs(a[i])] * -1;
            }
        }

     return -1;
    }

    public static void main(String args []) {
        int[] array = {2,4,3,5,1};
        int firstDuplicatePosition = firstDuplicate(array);
        System.out.println(firstDuplicatePosition);

    }
}
