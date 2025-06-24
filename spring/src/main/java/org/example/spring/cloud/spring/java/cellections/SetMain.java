package org.example.spring.cloud.spring.java.cellections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class SetMain {
    public static void main(String[] args) {

        Set<String> stringsSortedSetLoc = new TreeSet<>();

        Set<String> stringsLoc = new HashSet<>();
        stringsLoc.add("1");
        stringsLoc.add("2");
        stringsLoc.add("3");
        stringsLoc.add("4");
        stringsLoc.add("5");

        Set<String> stringsLoc2 = new HashSet<>();
        stringsLoc2.add("3");
        stringsLoc2.add("4");
        stringsLoc2.add("5");
        stringsLoc2.add("6");
        stringsLoc2.add("7");

        System.out.println(stringsLoc);
        stringsLoc.contains("3");
        Set<Person> personSetLoc = new HashSet<>();
        personSetLoc.add(Person.builder()
                               .withName("osman")
                               .withSurname("yay")
                               .withAge(55)
                               .build());
        personSetLoc.add(Person.builder()
                               .withName("osman")
                               .withSurname("yay")
                               .withAge(55)
                               .build());
        System.out.println(personSetLoc);


        stringsLoc2.retainAll(stringsLoc);
        System.out.println(stringsLoc2);
    }

}
