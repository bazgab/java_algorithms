package com.bazgab;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;


public class ProcessBuilderImplementation {

    public static Set<String> listFilesUsingDirectoryStream(String dir) throws IOException {
        Set<String> fileSet = new HashSet<>();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(dir))) {
            for (Path path : ds) {
                if (!Files.isDirectory(path)) {
                    fileSet.add(path.getFileName()
                            .toString());
                }
            }
        }
        return fileSet;
    }

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("ls");


        String dir = pb.directory(new File("/etc/")).toString();


        pb.redirectErrorStream(true);
        pb.redirectOutput(ProcessBuilder.Redirect.PIPE);
        Process p = pb.start();
        System.out.println(listFilesUsingDirectoryStream("/etc/maven"));
        System.out.println();



    }

}
