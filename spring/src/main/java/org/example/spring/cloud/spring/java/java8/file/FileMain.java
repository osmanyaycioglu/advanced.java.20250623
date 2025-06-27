package org.example.spring.cloud.spring.java.java8.file;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileMain {
    public static void main(String[] args) {
        try {
            Path pathLoc1 = Paths.get(".");
            System.out.println("Bura : " + pathLoc1.toAbsolutePath());
            Path pathLoc = Paths.get("customer.txt");
            List<String> stringsLoc = Files.readAllLines(pathLoc);
            String stringLoc = "osman,yay,55";
            String[] splitLoc = stringLoc.split(",");


            System.out.println(stringsLoc);
        } catch (Exception eParam) {
            eParam.printStackTrace();
        }

    }
}
