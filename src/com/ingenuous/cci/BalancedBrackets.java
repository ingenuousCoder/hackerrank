package com.ingenuous.cci;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets{

    public static boolean isBalanced(String expression) {
        Stack<Character> charStack = new Stack<Character>();

        for(Character c : expression.toCharArray()){
            if(c.charValue() == '{' || c.charValue() == '(' || c.charValue() == '[') {
                charStack.push(c);
            } else {
                if(charStack.isEmpty()){
                    return  false;
                }
                Character top = charStack.pop();
                if (c.charValue() == '}' && top.charValue() != '{') {
                        return false;
                    }else if(c.charValue() == ')' && top.charValue() != '(') {
                        return false;
                    }else if(c.charValue() == ']' && top.charValue() != '[') {
                    return false;
                }
            }
        }
        if(!charStack.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

