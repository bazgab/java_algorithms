package com.bazgab;

import java.io.File;

import java.nio.file.NoSuchFileException;


public class FileOperations {

    public static void deleteFile(String file) throws NoSuchFileException {

        File f = new File(file);
        if (f.delete()) {
            System.out.println("File " + file + " deleted successfully.");
        } else {
            throw new NoSuchFileException(file, null, "No such file found.") {

            };
        }
    }


    public static void main(String[] args) throws NoSuchFileException {
        String s = "sample";
        deleteFile(s);

    }

}
