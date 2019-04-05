package com.algo.basicSingly;

public class SinglyLinkedList {
    private Node first;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next = first;
        first = newNode;
    }

    public void displaySinglyLinkedList(){
        System.out.println("From first to last");
        Node currentNode = first;
        while(currentNode !=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public Node deleteFirst(){
        Node currentNode = first;
        first = first.next;
        return currentNode;
    }

    public void insertLast(int data){
        Node currentNode = first;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;
    }
}
