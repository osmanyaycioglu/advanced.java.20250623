package org.example.spring.cloud.spring.java.java8.lab1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonLab {

    public static void main(String[] args) {
        Path pathLoc = Paths.get("person.txt");
        try {
            List<String> stringsLoc = Files.readAllLines(pathLoc);
            Map<String, Person> collectLoc = stringsLoc.stream()
                                                       .map(s -> s.split(","))
                                                       .filter(sa -> sa.length == 3)
                                                       .map(sa -> Person.builder()
                                                                        .withName(sa[0])
                                                                        .withSurname(sa[1])
                                                                        .withAge(Integer.parseInt(sa[2]))
                                                                        .build())

                                                       .collect(Collectors.toMap(p -> p.getName()
                                                                                      + "-"
                                                                                      + p.getSurname(),
                                                                                             p -> p));


            System.out.println(collectLoc);
        } catch (Exception eParam) {
            eParam.printStackTrace();
        }

    }

}
