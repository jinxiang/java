package com.hmmloo.designpatterns.behavior.command3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Target {
    private Size size;
    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void printStatus() {
        log.info("{}, [size={}] [visibility={}]", this, getSize(), getVisibility());
    }

    public void changeSize() {
        Size oldSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(oldSize);
    }

    public void changeVisibility() {
        Visibility visible = getVisibility() == Visibility.INVISIBLE
                ? Visibility.VISIBLE : Visibility.INVISIBLE;
        setVisibility(visible);
    }
}
