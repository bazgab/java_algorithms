package com.bazgab;

import java.io.IOException;
import java.util.Scanner;

public class RuntimeTest {

    public static void main(String[] args) throws IOException {
        Process p;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to create: ");
        String testfile = input.next();
        String[] cmd = {"touch", testfile};
        p = Runtime.getRuntime().exec(cmd);
        System.out.println(p.toString());

    }



}
