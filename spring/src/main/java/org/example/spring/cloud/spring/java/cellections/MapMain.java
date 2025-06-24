package org.example.spring.cloud.spring.java.cellections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, Integer> mapcLoc = new ConcurrentHashMap<>(1_200_000,
                                                              0.9F,
                                                              1_000);
        long delta = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            mapcLoc.put(i,i);
        }
        System.out.println("Add delta : " + (System.currentTimeMillis() - delta));
        delta = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            Integer sLoc      = mapcLoc.get(i);
        }
        System.out.println("Get delta : " + (System.currentTimeMillis() - delta));


        Map<String, Person> mapLoc = new HashMap<>();
        mapLoc.put("osman1",
                   Person.builder()
                         .withName("osman")
                         .withSurname("yay")
                         .withAge(55)
                         .build());
        mapLoc.put("osman2",
                   Person.builder()
                         .withName("osman")
                         .withSurname("yay")
                         .withAge(56)
                         .build());

        System.out.println(mapLoc);
        System.out.println("---------------1----------------");
        Set<String> stringsLoc = mapLoc.keySet();
        for (String stringLoc : stringsLoc) {
            System.out.println(mapLoc.get(stringLoc));
        }
        System.out.println("---------------2----------------");
        Collection<Person> valuesLoc = mapLoc.values();
        for (Person valueLoc : valuesLoc) {
            System.out.println("P : " + valueLoc);
        }
        System.out.println("---------------2----------------");
        Set<Map.Entry<String, Person>> entriesLoc = mapLoc.entrySet();
        for (Map.Entry<String, Person> entryLoc : entriesLoc) {
            System.out.println("K:" + entryLoc.getKey() + " V:" + entryLoc.getValue());
        }
    }
}
