package org.example.spring.cloud.spring.java.generics;

public class DoubleValueHolderGeneric<A,B> {
    private A value1;
    private B value2;

    public A getValue1() {
        return value1;
    }

    public void setValue1(final A value1Param) {
        value1 = value1Param;
    }

    public B getValue2() {
        return value2;
    }

    public void setValue2(final B value2Param) {
        value2 = value2Param;
    }
}
