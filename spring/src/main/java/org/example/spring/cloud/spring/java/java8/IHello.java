package org.example.spring.cloud.spring.java.java8;

public interface IHello {
    public static final String prefix = "Osman";

    String sayHello(String name);
    String sayGoodBye(String name);

    default String sayAll(String name) {
        System.out.println("test");
        return sayHello(name) + " - " + sayGoodBye(name);
    }

    public static String staticTest(String name){
        return "Test : " + name;
    }
}
