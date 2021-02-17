package org.tyaa.demo.java.console.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /* List<Integer> integers = Arrays.asList(1, 3, 7, -10, 2, 1, 100, 0, 9, 200);
        integers.stream().map(integer -> integer * integer)
                // .sorted()
                // .sorted((o1, o2) -> o2 - o1)
                .sorted(Comparator.comparingInt(o -> o))
                .filter(integer -> integer < 100)
                .distinct()
                .dropWhile(integer -> integer == 0)
                .skip(2)
                .limit(2)
                .forEach(System.out::println); */
        Map<String, Integer> items = new HashMap<>();
        items.put("PC", 10);
        items.put("Display", 10);
        items.put("Keyboard", 12);
        items.put("Mouse", 12);
        /* List<String> flatItems =
                items.entrySet().stream()
                .flatMap(entry -> Stream.of(entry.getKey() + " - " + entry.getValue()))
                .collect(Collectors.toList());
        flatItems.parallelStream().forEach(System.out::println); */
        long flatItemsCount =
                items.entrySet().stream()
                        .flatMap(entry -> Stream.of(entry.getKey() + " - " + entry.getValue()))
                        .count();
        System.out.println(flatItemsCount);
    }
}
