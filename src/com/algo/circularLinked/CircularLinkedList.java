package com.algo.circularLinked;

public class CircularLinkedList {
    Node first;
    Node last;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }


    public boolean isEmpty(){
        return first == null;
    }
    public void displayCircularLinkedList(){
        System.out.println("From Start to End");
        Node currentNode = first;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
