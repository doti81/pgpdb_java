package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Czytanie {

    public static void main(String[] args) {
        String filePath;
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);
        }
    }
    //new BufferedReader(new FileReader("/path/to/text/file.txt"));

//String filePath = "/path/to/text/file.txt"
//int number = 1234567;
//FileWriter fileWriter = null;
//
//try {
//    fileWriter = new FileWriter(filePath);
//    fileWriter.write(Integer.toString(number));
//} finally {
//    if (fileWriter != null) {
//        fileWriter.close();
//    }
//}

//String filePath = "/path/to/text/file.txt"
//int number = 0;
//BufferedReader fileReader = null;
//
//try {
//    fileReader = new BufferedReader(new FileReader(filePath));
//    String numberAsString = fileReader.readLine();
//    number = Integer.parseInt(numberAsString);
//} finally {
//    if (fileReader != null) {
//        fileReader.close();
//    }
//}


}