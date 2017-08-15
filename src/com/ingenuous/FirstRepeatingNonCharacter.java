package com.ingenuous;

/**
 * Created by Alpeshk on 8/9/2017.
 */
public class FirstRepeatingNonCharacter {

    public static char firstNotRepeatingCharacter(String s) {
        char nonRepeatingChar='_';
        for (int i = 0; i<s.length()/2; i++) {
            if ((s.substring(s.length()/2,(s.length()/2) + i+1).compareToIgnoreCase(s.substring(0,i+1))) != 0) {
                nonRepeatingChar = s.charAt(i);
                break;
            }
        }

        if(nonRepeatingChar == '_' && (s.length()%2 == 1)){
            nonRepeatingChar = s.charAt(s.length() - 1);
        }

        return nonRepeatingChar;
    }

    public static void main(String args[]) {
        String s="abcabcd";
        System.out.println(firstNotRepeatingCharacter(s));
        s="a";
        System.out.println(firstNotRepeatingCharacter(s));
        s="abacabad";
        System.out.println(firstNotRepeatingCharacter(s));
        s="abacabaabacaba";
        System.out.println(firstNotRepeatingCharacter(s));
        s="zzz";
        System.out.println(firstNotRepeatingCharacter(s));
        s="bccccccccccccccb";
        System.out.println(firstNotRepeatingCharacter(s));




    }

}
