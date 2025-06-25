package org.example.spring.cloud.spring.java.java8;

public class HelloFactory {
    public static IHello createHello(int type){
        switch (type){
            case 1:
                return new HelloEng();
            default:
                return new HelloTr();
        }
    }
}
