package org.example.spring.cloud.spring.java.cellections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain2 {

    public static void main(String[] args) {
        List<String> listLoc = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            listLoc.add("osman");
        }
        listLoc.clear();
        listLoc = new LinkedList<>();

        System.gc();

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException eParam) {
        }

        long mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.add("osman");
        }
        System.out.println( "Add delta : " + (System.currentTimeMillis() - mDelta));

        listLoc.clear();

        mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.add("osman");
        }
        System.out.println( "Add delta : " + (System.currentTimeMillis() - mDelta));


        mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            String sLoc = listLoc.get(i);
        }
        System.out.println( "Get delta : " + (System.currentTimeMillis() - mDelta));

        mDelta = System.currentTimeMillis();
        for (String sLoc : listLoc) {

        }
        System.out.println( "Iterate delta : " + (System.currentTimeMillis() - mDelta));

        mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.remove(0);
        }
        System.out.println( "Remove delta : " + (System.currentTimeMillis() - mDelta));

    }

}
