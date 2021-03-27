package com.jaewoo.fp.supplier;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = String::toUpperCase;

        BiFunction<String, Integer, String> nameAge = (name, age) -> {
            if (name == null) {
                throw new IllegalArgumentException("name is null");
            }

            if (age == null) {
                throw new IllegalArgumentException("age is null");
            }

            return String.format("name : %s, age : %s", name, age);
        };

        System.out.println(nameAge.apply("jaewoo", Integer.valueOf(40)));
    }
}
