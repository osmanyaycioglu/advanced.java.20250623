package org.example.spring.cloud.spring.java.java8.stream;

import org.example.spring.cloud.spring.java.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain5 {
    public static void main(String[] args) {
        List<String> stringsLoc = List.of("osman",
                                          "ali",
                                          "mehmet",
                                          "ali",
                                          "ayşe",
                                          "fatma",
                                          "osman",
                                          "mahmut");

        Set<Character> charactersLoc = new TreeSet<>();
        stringsLoc.stream()
                  .map(s -> s.toCharArray())
                  .forEach(is -> {
                      for (char iLoc : is) {
                          charactersLoc.add(iLoc);
                      }
                  });
        System.out.println(charactersLoc);

        stringsLoc.stream()
                  .flatMap(s -> {
                      char[]      charArrayLoc = s.toCharArray();
                      Character[] ch           = new Character[charArrayLoc.length];
                      for (int i = 0; i < charArrayLoc.length; i++) {
                          ch[i] = charArrayLoc[i];
                      }
                      return Arrays.stream(ch);
                  })
                  .distinct()
                  .sorted()
                  .forEach(c -> System.out.println(c));


    }
}
