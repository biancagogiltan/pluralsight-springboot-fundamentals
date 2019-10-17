package com.pluralsight.fundamentals.entity;

import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");

        long count = stream.filter(s -> s.startsWith("g"))
//                .peek(System.out::println)
                .count(); // grizzly
        System.out.println(count);
    }
}
