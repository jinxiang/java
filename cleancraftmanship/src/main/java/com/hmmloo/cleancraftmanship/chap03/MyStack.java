package com.hmmloo.cleancraftmanship.chap03;

public class MyStack {
    private boolean empty = true;
    private int size = 0;
    private int element;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int i) {
        size++;
        element = i;
    }

    public int pop() throws UnderflowException {
        if (isEmpty()) throw new UnderflowException();
        size--;
        return element;
    }

    public int getSize() {
        return size;
    }
}
