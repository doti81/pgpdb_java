package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pisanie {

    public static void main(String[] args) throws IOException {
        String filePath = "dziekanat.txt";

        Student student = new Student("Witoldx", "Malocha", 1000);

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false));
        writer.append(student.getImie());
        writer.newLine();
        writer.append(student.getNazwisko());
        writer.newLine();
        writer.append(student.getPesel()+"");
        writer.close();
    }
}
