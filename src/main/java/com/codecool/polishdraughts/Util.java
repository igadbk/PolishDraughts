package com.codecool.polishdraughts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Util {

    public static void readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String textLine;
        try {
            while ((textLine = br.readLine()) != null) {
                System.out.println(textLine);
            }
        } catch (IOException e) {
            System.out.println("not working yet");
        }
    }
}
