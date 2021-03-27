package com.jaewoo.fp.combinatorpattern;

import java.time.LocalDate;

import static com.jaewoo.fp.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "alice",
                "alice@gmail.com",
                "0824567778",
                LocalDate.of(2000, 1, 1)
        );

        // using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
