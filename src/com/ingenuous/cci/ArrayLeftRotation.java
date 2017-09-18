package com.ingenuous.cci;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            int b[] = new int[n];
            int b_i;
            for(b_i=0; b_i < n-k; b_i++){
                b[b_i] = a[k+b_i];
            }
            for(int a_i=0; a_i<k;a_i++){
                b[b_i]=a[a_i];
                b_i++;
            }

            for(b_i=0; b_i < n; b_i++){
                System.out.print(b[b_i]+ " ");
            }
        }
    }