package com.codecafe.java9.streams;

import java.util.stream.Stream;

public class TakeWhile {

    public static void main(String[] args) {

        System.out.println("filter:");

        // filter will remove all items from the stream
        // which do not satisfy the condition

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        .filter(n -> n <= 5)
        .forEach(n -> System.out.print(n + " "));

        System.out.println("\n");

        System.out.println("takeWhile:");

        // takeWhile will abort the stream on the first occurrence of an item
        // which does not satisfy the condition

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        .takeWhile(n -> n <= 5)
        .forEach(n -> System.out.print(n + " "));

    }

}