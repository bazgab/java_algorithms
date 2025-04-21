package com.bazgab;

import java.util.TreeMap;


public class TreeMapExample {



    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        int n;
        for (n = 1; n < 10; n++) {
            tm.put(n, "One more addition");
            System.out.println(tm);
        }

        System.out.println(tm.entrySet());
        tm.remove(8);
        System.out.println(tm);

    }
}
