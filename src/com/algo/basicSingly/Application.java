package com.algo.basicSingly;

public class Application {
    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(23);
        singlyLinkedList.insertFirst(40);
        singlyLinkedList.insertFirst(50);
        singlyLinkedList.insertFirst(60);
        singlyLinkedList.displaySinglyLinkedList();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.displaySinglyLinkedList();
        singlyLinkedList.insertLast(1000);
        singlyLinkedList.displaySinglyLinkedList();
    }
}
