package com.hmmloo.designpatterns.behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCaretaker {
    private final Deque<EmpMemento> mementos = new ArrayDeque<>();

    public EmpMemento getMemento() {
        return mementos.pop();
    }

    public void addMemento(EmpMemento memento) {
        mementos.push(memento);
    }
}
