package com.hmmloo.datastructures;

public class LinkedList {
    public class Node {
        public int data;
        public Node next;
    }
    private Node head = null;
    private Node tail = null;

    public LinkedList() {
        Node guard = new Node();
        head = guard;
        tail = guard;
    }

    public void insertAtTail(Node newNode) {
        tail.next = newNode;
        tail = newNode;
    }

    public Node find(int value) {
        Node p = head;
        while (p!= null && p.data != value) {
            p = head.next;
        }
        return p;
    }

    void insert(Node node, Node value) {
        if (node == null) {
            value.next = head;
            head = value;
        } else {
            value.next = node.next;
            node.next = value;
        }
    }

    void remove(Node node, Node value) {
        if ( node == null) {
            head = head.next;
        } else  {
            node.next = value.next;
        }
    }

    public void remove(int value) {
        Node node = head;
        Node previousNode = null;
        while (node != null && node.data != value) {
            previousNode = node;
            node = node.next;
        }
        if (node != null ) {
            if (previousNode == null ) {
                head = node.next;
            } else {
                previousNode.next = node.next;
            }
        }
    }

    void remove(Node node) {
        if (node == null) {
            return;
        }
        if (head == node) {
            head = node.next;
            return;
        }
        Node p = head;
        while (p.next != null && p.next != node) {
            p = p.next;
        }
        if (p.next != null) {
            p.next = node.next;
        }
    }
}
