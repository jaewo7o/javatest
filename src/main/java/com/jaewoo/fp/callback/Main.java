package com.jaewoo.fp.callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("John", "Montana", value -> {
            System.out.println("no lastname provided for " + value);
        });

        hello("John", null, value -> {
            System.out.println("no lastname provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
