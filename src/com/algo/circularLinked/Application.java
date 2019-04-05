package com.algo.circularLinked;

import com.algo.basicSingly.SinglyLinkedList;

public class Application {
    public static void main(String[] args){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(23);
        circularLinkedList.insertFirst(40);
        circularLinkedList.insertFirst(50);
        circularLinkedList.insertFirst(60);
        circularLinkedList.displayCircularLinkedList();
        circularLinkedList.deleteFirst();
        circularLinkedList.displayCircularLinkedList();
        circularLinkedList.insertLast(1000);
        circularLinkedList.deleteFirst();
        circularLinkedList.displayCircularLinkedList();
    }
}
