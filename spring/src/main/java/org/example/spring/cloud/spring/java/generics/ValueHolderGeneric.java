package org.example.spring.cloud.spring.java.generics;

public class ValueHolderGeneric<A> {
    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(final A valueParam) {
        value = valueParam;
    }
}
