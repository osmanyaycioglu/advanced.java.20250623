package org.example.spring.cloud.spring.java.java8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        List<String> stringsLoc = List.of("osman",
                                          "ali",
                                          "mehmet",
                                          "ali",
                                          "ayşe",
                                          "fatma",
                                          "osman",
                                          "mahmut");
        Map<String, String> testMap = new HashMap<>();

        stringsLoc.stream()
                  .peek(s -> System.out.println("Log Start : " + s))
                  .filter(s -> s.contains("a"))
                  .peek(s -> System.out.println("Log before Filter : " + s))
                  .peek(s -> testMap.put(s,
                                         s))
                  .filter(s -> s.length() > 4)
                  .peek(s -> System.out.println("Log before distinct : " + s))
                  .distinct()
                  .peek(s -> System.out.println("Log before foreach : " + s))
                  .forEach(s -> System.out.println(s));
    }
}
