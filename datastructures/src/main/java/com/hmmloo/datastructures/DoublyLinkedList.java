package com.hmmloo.datastructures;

public class DoublyLinkedList {
    public class Node {
        public int data;
        public Node previous;
        public Node next;
    }
    private Node head = null;

    public void remove(int value) {
        Node node = head;
        while(node!= null && node.data != value) {
            node = node.next;
        }
        if(node != null) {
            if (node.previous == null) {
                head = node.next;
            } else {
                node.previous.next = node.next;
            }
        }
    }

    public void remove(Node node) {
        if(node != null) {
            if(node.previous == null) {
                head = node.next;
            } else {
                node.previous.next = node.next;
            }
        }
    }


    public Node getHead() {
        return new Node();




    }
}
