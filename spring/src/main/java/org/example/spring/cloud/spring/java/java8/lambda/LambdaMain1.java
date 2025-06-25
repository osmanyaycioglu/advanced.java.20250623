package org.example.spring.cloud.spring.java.java8.lambda;

import java.util.Iterator;
import java.util.List;

public class LambdaMain1 {
    public static void main(String[] args) {
        String str = "deneme";

        IHelloLambda helloLambdaLoc = new IHelloLambda() {
            @Override
            public String sayHello(final String name) {
                return "Hello " + name;
            }
        };

        IHelloLambda helloLambdaLoc2 = new IHelloLambda() {
            @Override
            public String sayHello(final String name) {
                return "Hello " + name;
            }
        };

        IHelloLambda helloLambdaLoc1 = e -> "Hello " + e + str;

        IHelloLambda helloLambdaLoc3 = e -> "Merhaba " + e;

        IHelloLambda helloLambdaLoc4 = e -> {
            System.out.println("deneme");
            return "Merhaba " + e;
        };

        List<String> stringsLoc = List.of("osman",
                                          "ali",
                                          "mehmet");
        Iterator<String> iteratorLoc = stringsLoc.iterator();
        while (iteratorLoc.hasNext()) {
            String nextLoc = iteratorLoc.next();
            System.out.println(nextLoc);
        }

        for (String stringLoc : stringsLoc) {
            System.out.println(stringLoc);
        }

        stringsLoc.forEach(s -> System.out.println(s));

        IGoodbyeLambda goodbyeLambdLoc = (isim, soyisim) -> "Goodbye " + isim + " " + soyisim;

        IGoodbyeLambda goodbyeLambdLoc2 = LambdaMain1::xyz;

        LambdaMain1 main1Loc = new LambdaMain1();

        IGoodbyeLambda goodbyeLambdLoc3 = main1Loc::abc;
    }

    public static String xyz(String name,
                             String surname) {
        System.out.println("Girdiler : " + name + " - " + surname);
        String stringLoc = "Goodbye  " + name + " " + surname;
        System.out.println("cıktı : " + stringLoc);
        return stringLoc;
    }

    public String abc(String name,
                      String surname) {
        System.out.println("Girdiler : " + name + " - " + surname);
        String stringLoc = "Goodbye  " + name + " " + surname;
        System.out.println("cıktı : " + stringLoc);
        return stringLoc;
    }

}
