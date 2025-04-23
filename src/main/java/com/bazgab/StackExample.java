package com.bazgab;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stk = new Stack<>();

        String s =  "[()]";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            stk.push(String.valueOf(arr[i]));

        }

        System.out.println(stk);

        for (int j = 0; j < arr.length / 2; j++) {
            stk.pop();
        }

        System.out.println(stk);

    }

}
