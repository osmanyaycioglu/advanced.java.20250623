package org.example.spring.cloud.spring.java.java8;

public class PolyMain {
    public static void main(String[] args) {
        IHello helloLoc = HelloFactory.createHello(1);

        System.out.println("Çıktı : " + helloLoc.sayHello("osman"));

    }
}
