package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Pisanie {

    public static void main(String[] args) throws IOException {
        String filePath = "dziekanat.txt";

        FileWriter writer = new FileWriter(filePath, false);
        writer.append("dupa");
        writer.close();
    }
}
