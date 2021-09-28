package com.hmmloo.designpatterns.structural.bridge;

public abstract class Message {
    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}
