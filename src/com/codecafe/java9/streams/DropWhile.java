package com.codecafe.java9.streams;

import java.util.stream.Stream;

public class DropWhile {

    public static void main(String[] args) {

        System.out.println("takeWhile:");

        // takeWhile will abort the stream on the first occurrence of an item
        // which does not satisfy the condition

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        .takeWhile(n -> n <= 5)
        .forEach(n -> System.out.print(n + " "));

        System.out.println("\n");

        System.out.println("dropWhile:");

        // opposite of takeWhile
        // drops elements WHILE the condition is true
        // takes rest of the elements after first false

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        .dropWhile(n -> n <= 5)
        .forEach(n -> System.out.print(n + " "));

    }

}