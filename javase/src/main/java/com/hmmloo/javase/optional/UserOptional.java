package com.hmmloo.javase.optional;

import java.util.Optional;

public class UserOptional {
    static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        User u1 = new User("JX");
        User u2 = null;
        System.out.println(Optional.ofNullable(u1).map(u->u.getName()).get());
        System.out.println(Optional.ofNullable(u2).map(u->u.getName()).get());
    }
}
