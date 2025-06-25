package org.example.spring.cloud.spring.java.java8;

public class HelloEng implements IHello {
    @Override
    public String sayHello(final String name) {
        return "Hello " + name;
    }

    @Override
    public String sayGoodBye(final String name) {
        return "Goodbye " + name;
    }

    public void test(){
    }
}
