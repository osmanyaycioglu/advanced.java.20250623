package org.example.spring.cloud.spring.java.java8.stream;

import org.example.spring.cloud.spring.java.Employee;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain2 {
    public static void main(String[] args) {
        List<String> stringsLoc = List.of("osman",
                                          "ali",
                                          "mehmet",
                                          "ali",
                                          "ayşe",
                                          "fatma",
                                          "osman",
                                          "mahmut");
        List<Employee> collectLoc = stringsLoc.stream()
                                              .map(s -> Employee.builder()
                                                                .withName(s)
                                                                .build())
                                              .distinct()
                                              .collect(Collectors.toList());

        System.out.println(collectLoc);

        IntSummaryStatistics collectLoc1 = stringsLoc.stream()
                                                     .map(s -> Employee.builder()
                                                                       .withName(s)
                                                                       .build())
                                                     .distinct()
                                                     .map(emp -> emp.getName()
                                                                    .length())
                                                     .collect(Collectors.summarizingInt(i -> i));

        int sumLoc = stringsLoc.stream()
                               .map(s -> Employee.builder()
                                                 .withName(s)
                                                 .build())
                               .distinct()
                               .mapToInt(emp -> emp.getName()
                                                   .length())
                               .sum();

        IntSummaryStatistics intSummaryStatisticsLoc = stringsLoc.stream()
                                                                 .map(s -> Employee.builder()
                                                                                   .withName(s)
                                                                                   .build())
                                                                 .distinct()
                                                                 .mapToInt(emp -> emp.getName()
                                                                                     .length())
                                                                 .summaryStatistics();
        System.out.println("Stats : " + intSummaryStatisticsLoc);
    }
}
