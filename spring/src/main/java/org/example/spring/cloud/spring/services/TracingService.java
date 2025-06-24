package org.example.spring.cloud.spring.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TracingService {
    private List<String> names = new ArrayList<>();

    public void addName(String name){
        synchronized(this){
            names.add(name);
        }
    }

    public void removeName(String name){
        synchronized(this){
            names.remove(name);
        }
    }


}
