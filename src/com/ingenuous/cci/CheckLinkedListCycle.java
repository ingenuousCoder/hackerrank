package com.ingenuous.cci;

public class CheckLinkedListCycle {
    /*
/// *
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
//* /

    boolean hasCycle(Node head) {
        if(head == null || head.next == null){
            return false;
        }

        Node fast = head.next.next;
        Node slow = head;

        while(slow != null){
            if(fast == null || fast.next == null) {
                return false;
            }
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    */
}
