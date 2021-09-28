package com.hmmloo.designpatterns.behavior.interpreter;
/**
 * AbstractExpression (Expression): Declares an interpret() operation that all nodes (terminal and nonterminal) in the AST overrides.
 * TerminalExpression (NumberExpression): Implements the interpret() operation for terminal expressions.
 * NonterminalExpression (AdditionExpression, SubtractionExpression, and MultiplicationExpression): Implementoperations the interpret() operation for all nonterminal expressions.
 * Context (String): Contains information that is global to the interpreter. It is this String expression with the Postfix notation that has to be interpreted and parsed.
 * Client (ExpressionParser): Builds (or is provided) the AST assembled from TerminalExpression and NonTerminalExpression. The Client invokes the interpret() operation.
 */
