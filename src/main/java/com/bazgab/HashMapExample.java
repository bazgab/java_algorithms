package com.bazgab;

import java.util.HashMap;

public class HashMapExample {



    public static void main(String[] args) {

        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "First Item");
        myHashMap.put(2, "Second Item");

        System.out.println(myHashMap.get(1));

    }

}
