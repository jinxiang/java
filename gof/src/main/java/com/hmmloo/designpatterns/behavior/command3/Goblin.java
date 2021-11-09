package com.hmmloo.designpatterns.behavior.command3;

public class Goblin extends Target {
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
