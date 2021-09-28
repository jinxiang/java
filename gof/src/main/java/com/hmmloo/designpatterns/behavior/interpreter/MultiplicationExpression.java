package com.hmmloo.designpatterns.behavior.interpreter;

public class MultiplicationExpression implements Expression {
    private final Expression firstExpression, secondExpression;

    public MultiplicationExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
