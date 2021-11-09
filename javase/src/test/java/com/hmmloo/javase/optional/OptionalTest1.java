package com.hmmloo.javase.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest1 {
    @Test
    public void test1() {
        UserOptional.User u1 = new UserOptional.User("JX");
        UserOptional.User u2 = null;
        System.out.println(Optional.ofNullable(u1).map(u->u.getName()));
        System.out.println(Optional.ofNullable(u2).map(u->u.getName()).orElse(null));
    }
}
