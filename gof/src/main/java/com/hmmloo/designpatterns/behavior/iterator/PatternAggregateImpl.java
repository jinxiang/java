package com.hmmloo.designpatterns.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class PatternAggregateImpl implements PatternAggregate {
    private final List<DesignPattern> patternList;

    public PatternAggregateImpl() {
        this.patternList = new ArrayList<>();
    }

    @Override
    public void addPattern(DesignPattern designPattern) {
        patternList.add(designPattern);
    }

    @Override
    public void removePattern(DesignPattern designPattern) {
        patternList.remove(designPattern);
    }

    @Override
    public PatternIterator getPatternIterator() {
        return new PatternIteratorImpl(patternList);
    }
}
