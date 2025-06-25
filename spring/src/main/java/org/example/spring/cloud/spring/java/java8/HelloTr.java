package org.example.spring.cloud.spring.java.java8;

public class HelloTr implements IHello {
    @Override
    public String sayHello(final String name) {
        return "Merhaba " + name;
    }

    @Override
    public String sayGoodBye(final String name) {
        return "Güle güle " + name;
    }
    public void test(){
    }
}
