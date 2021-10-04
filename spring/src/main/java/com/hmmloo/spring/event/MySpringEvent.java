package com.hmmloo.spring.event;

import org.springframework.context.ApplicationEvent;

public class MySpringEvent extends ApplicationEvent {
    public MySpringEvent(Object source) {
        super(source);
    }
}
