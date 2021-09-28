package com.hmmloo.designpatterns.behavior.visitor;

public interface MailClient {
    void sendMail(String[] mailInfo);

    void receiveMail(String[] mailInfo);

    boolean accept(MailClientVisitor visitor);
}
