package org.example.spring.cloud.spring.java.java8.stream;

import org.example.spring.cloud.spring.java.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyCollector implements Collector<Employee, List<Employee>,List<Employee>> {
    @Override
    public Supplier<List<Employee>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Employee>, Employee> accumulator() {
        return (al,emp) -> al.add(emp);
    }

    @Override
    public BinaryOperator<List<Employee>> combiner() {
        return (al1,al2) -> {
            al1.addAll(al2);
            return al1;
        };
    }

    @Override
    public Function<List<Employee>, List<Employee>> finisher() {
        return al -> al;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
