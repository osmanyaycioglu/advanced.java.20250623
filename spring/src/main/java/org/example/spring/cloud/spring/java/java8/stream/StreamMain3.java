package org.example.spring.cloud.spring.java.java8.stream;

import org.example.spring.cloud.spring.java.Employee;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain3 {
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
                                              .reduce(new ArrayList<Employee>(),
                                                      (al, emp) -> {
                                                          al.add(emp);
                                                          return al;
                                                      },
                                                      (al1, al2) -> {
                                                          al1.addAll(al2);
                                                          return al1;
                                                      });

        Integer totalChar = stringsLoc.stream()
                                      .map(s -> Employee.builder()
                                                        .withName(s)
                                                        .build())
                                      .distinct()
                                      .reduce(0,
                                              (intVal, emp) -> emp.getName()
                                                                  .length() + intVal,
                                              (intVal1, intVal2) -> intVal1 + intVal2);


        List<Employee> collectLoc1 = stringsLoc.stream()
                                               .map(s -> Employee.builder()
                                                                 .withName(s)
                                                                 .build())
                                               .distinct()
                                               .collect(new MyCollector());


        Map<String, Employee> collectLoc2 = stringsLoc.stream()
                                                      .map(s -> Employee.builder()
                                                                        .withName(s)
                                                                        .build())
                                                      .distinct()
                                                      .collect(Collectors.toMap(emp -> emp.getName(),
                                                                                emp -> emp));

    }
}
