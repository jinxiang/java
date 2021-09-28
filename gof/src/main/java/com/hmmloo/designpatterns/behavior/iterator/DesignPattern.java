package com.hmmloo.designpatterns.behavior.iterator;

public class DesignPattern {
    private final String patternName;
    private final String patternType;

    public DesignPattern(String patternName, String patternType) {
        this.patternName = patternName;
        this.patternType = patternType;
    }

    public String getPatternName() {
        return patternName;
    }

    public String getPatternType() {
        return patternType;
    }
}
