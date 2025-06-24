package org.example.spring.cloud.spring.java.cellections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListMain {

    public static void main(String[] args) {
        List<String> listLocThreadSafe  = new Vector<>();
        List<String> listLocThreadSafe2 = Collections.synchronizedList(new ArrayList<>(1_500_000));

        List<String> listLocIterateSafe = new CopyOnWriteArrayList<>();

        List<String> listLoc            = new ArrayList<>(1_500_000);
        listLoc.add("osman");
        String[] stringsLoc = new String[1_000];

        long delta = System.nanoTime();
        listLoc.add("osman");
        System.out.println("Add delta : " + (System.nanoTime() - delta));

        for (int i = 0; i < 1_000_000; i++) {
            listLoc.add("osman");
        }
        listLoc.clear();
        listLoc = new ArrayList<>(1_500_000);

        System.gc();

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException eParam) {
        }

        long mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.add("osman");
        }
        System.out.println("Add delta : " + (System.currentTimeMillis() - mDelta));

        listLoc.clear();

        mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.add("osman");
        }
        System.out.println("Add delta : " + (System.currentTimeMillis() - mDelta));


        mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String sLoc = listLoc.get(i);
        }
        System.out.println("Get delta : " + (System.currentTimeMillis() - mDelta));

        mDelta = System.currentTimeMillis();
        for (String sLoc : listLoc) {

        }
        System.out.println("Iterate delta : " + (System.currentTimeMillis() - mDelta));

        mDelta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.remove(0);
        }
        System.out.println("Remove delta : " + (System.currentTimeMillis() - mDelta));

        boolean osman75Loc = listLoc.contains("osman75");
    }

}
