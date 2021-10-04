package com.hmmloo.spring.event;

import org.springframework.context.ApplicationListener;

public class MySpringEventListener implements ApplicationListener<MySpringEvent> {
    public MySpringEventListener(String name) {
        this.name = name;
    }

    private String name;

    private String article;

    @Override
    public void onApplicationEvent(MySpringEvent event) {
        updateArticle(event);
    }

    private void updateArticle(MySpringEvent event) {
        this.article = (String) event.getSource();
        System.out.printf("我是读者：%s，文章已更新为：%s\n", this.name, this.article);
    }
}
