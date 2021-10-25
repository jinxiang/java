package com.hmmloo.cleancraftmanship.chap03;

public class MyStack {
    private int size = 0;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int i) {
        elements[size++] = i;
    }

    public int pop() throws UnderflowException {
        if (isEmpty()) throw new UnderflowException();
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
