package com.hmmloo.spring.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class MySpringEventListenerConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return (args) -> {
            log.info("发布事件：什么是观察者模式？");
            context.publishEvent(new MySpringEvent("什么是观察者模式？"));
        };
    }

    @Bean
    public MySpringEventListener readerListener1(){
        return new MySpringEventListener("小明");
    }

    @Bean
    public MySpringEventListener readerListener2(){
        return new MySpringEventListener("小张");
    }

    @Bean
    public MySpringEventListener readerListener3(){
        return new MySpringEventListener("小爱");
    }
}