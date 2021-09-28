package com.hmmloo.designpatterns.behavior.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionParserTest {
    @Test
    public void testParse() throws Exception {
        String input="2 1 5 + *";
        ExpressionParser expressionParser=new ExpressionParser();
        int result=expressionParser.parse(input);
        System.out.println("Final result: "+result);
    }
}