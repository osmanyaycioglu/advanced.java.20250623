package org.example.spring.cloud.spring.java.java8.lambda;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;

public class LambdaMain2 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReferenceLoc = new AtomicReference<>();

        StringWrapper prefix = new StringWrapper();
        prefix.setStr("test");
        atomicReferenceLoc.set("test");

        Consumer<String> consumerLoc = s -> System.out.println(prefix.getStr()
                                                               + " "
                                                               + s
                                                               + " "
                                                               + atomicReferenceLoc.get());
        Consumer<String>  consumerLoc2 = System.out::println;
        Consumer<Integer> consumerLoc3 = i -> i = i + 100;


        prefix.setStr("deneme");
        atomicReferenceLoc.set("deneme");

        BiConsumer<String, String> biConsumerLoc = (s1, s2) -> System.out.println(s1 + " " + s2);

        Function<String, Integer>          functionLoc       = s -> s.length();
        Function<String, Integer>          functionLoc2      = String::length;
        BiFunction<String, String, String> biFunctionLoc     = (s1, s2) -> s1 + " " + s2;
        BinaryOperator<String>             binaryOperatorLoc = (s1, s2) -> s1 + " " + s2;

        Predicate<String>           predicateLoc   = x -> x.length() > 5;
        BiPredicate<String, String> biPredicateLoc = (s1, s2) -> s1.length() > s2.length();

        Supplier<String> supplierLoc = () -> "osman";

        prefix.setStr("another");

    }

}
