package com.hmmloo.designpatterns.behavior.visitor;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);

    void visit(SquirrelMailClient mailClient);

    void visit(ZimbraMailClient mailClient);
}
