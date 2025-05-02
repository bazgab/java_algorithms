package com.bazgab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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


        //Utilizing Files package to manipulate
        Path filePath = Paths.get(testfile);
        try {
            //Write content to file
            Files.writeString(filePath, "Hello World !!", StandardOpenOption.APPEND);

            //Optionally verify the file content
            String content = Files.readString(filePath);

            System.out.println(content);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }



}
