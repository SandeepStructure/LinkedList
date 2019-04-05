package com.algo.basic;

public class Application {
    public static int listLength(Node node){
        int count = 0;
        Node currentNode = node;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;

        }
        return count;
    }

    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 4;

        Node nodeC = new Node();
        nodeC.data = 4;

        Node nodeD = new Node();
        nodeD.data = 4;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));

    }
}
