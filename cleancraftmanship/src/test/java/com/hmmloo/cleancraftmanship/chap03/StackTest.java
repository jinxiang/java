package com.hmmloo.cleancraftmanship.chap03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StackTest {
    MyStack myStack = new MyStack();

    @Test
    public void createStack() {
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void canPush() {
        myStack.push(0);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void afterOnePushAndOnePop_isEmpty() {
        myStack.push(0);
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void afterTwoPushs_sizeIsTwo() {
        myStack.push(0);
        myStack.push(1);
        assertEquals(2, myStack.getSize());
    }

    @Test
    public void afterOnePushAndOnePop_sizeIsZeroAndEmpty(){
        myStack.push(0);
        myStack.pop();
        assertTrue(myStack.isEmpty());
        assertEquals(0, myStack.getSize());
    }

    @Test
    public void afterOnePush_isNotEmpty(){
        myStack.push(0);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void popEmptyStack_throwsUnderflowException() {
        assertThrows(UnderflowException.class, () -> myStack.pop());
    }

    @Test
    public void afterPushX_willPopX() {
        myStack.push(99);
        assertEquals(99, myStack.pop());
        myStack.push(88);
        assertEquals(88, myStack.pop());
    }

    @Test
    public void afterPushXandY_willPopYthenX() {
        myStack.push(99);
        myStack.push(88);
        assertEquals(88, myStack.pop());
        assertEquals(99, myStack.pop());
    }
}
