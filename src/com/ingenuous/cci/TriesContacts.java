package com.ingenuous.cci;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TriesContacts {

    public static class Node{
        private static int MAX_CHARS = 26;
        public Node[] children = new Node[MAX_CHARS];
        int size = 0;

        private int getCharIndex(char c) {
            return  c - 'a';
        }
        private Node getNode(char c){
            return children[getCharIndex(c)];
        }

        private void setNode(char c, Node node){
            children[getCharIndex(c)] = node;
        }

        public void add(String s){
            add(s, 0);
        }

        private void add(String s, int index){
            size++;
            if(s.length() == index){
                return;
            }
            char current = s.charAt(index);
            Node child = getNode(current);
            if(getNode(s.charAt(index)) == null){
                child = new Node();
                setNode(s.charAt(index), child);
            }
            child.add(s, index + 1);
        }

        public int getCount(String s, int index){
            if(s.length() == index){
                return size;
            }
            Node child = getNode(s.charAt(index));
            if(child == null){
                return 0;
            }

            return child.getCount(s, index +1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node trie = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.compareToIgnoreCase("add") == 0){
                trie.add(contact);
            }else if(op.compareToIgnoreCase("find") == 0){
                System.out.println(trie.getCount(contact,0));
            }
        }
    }
}
