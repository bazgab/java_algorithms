package com.bazgab;

public class NthFibonacciNumber {

    public static Integer findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }


    public static void main(String[] args) {

        int n = 13;
        System.out.println(findFibonacci(n));

    }


}
