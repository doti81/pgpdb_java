package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dziekanat.txt"));

        List<Teacher> teachers = new ArrayList<>();
        List<Przedmiot> przedmioty = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Ocena> oceny = new ArrayList<>();

        String line;  //odczytywanie
        while ((line = reader.readLine()) != null) {
            if (line.equals("# student")) {
                String imie = reader.readLine();
                String nazwisko = reader.readLine();
                int pesel = Integer.parseInt(reader.readLine());
                Student student = new Student(imie, nazwisko, pesel);
                students.add(student);
            } else if (line.equals("# teacher")) {
                String imie = reader.readLine();
                String nazwisko = reader.readLine();
                int pesel = Integer.parseInt(reader.readLine());
                String stopien = reader.readLine();
                Teacher teacher = new Teacher(imie, nazwisko, stopien, pesel);
                teachers.add(teacher);
            } else if (line.equals("#przedmiot")) {
                int id = Integer.parseInt(reader.readLine());
                String nazwa = reader.readLine();
                int ects = Integer.parseInt(reader.readLine());
                Przedmiot przedmiot = new Przedmiot(id, nazwa, ects);
                przedmioty.add(przedmiot);

            } else if (line.equals("# ocena")) {
                int id= Integer.parseInt(reader.readLine());
                int ocena =Integer.parseInt(reader.readLine());
                int nr_studenta= Integer.parseInt(reader.readLine());
                int nr_przedmiotu =Integer.parseInt(reader.readLine());
                Student student = students.get(nr_studenta);
                Przedmiot przedmiot = przedmioty.get(nr_przedmiotu);
                Ocena ocena1= new Ocena(id,ocena,student,przedmiot);
                oceny.add(ocena1);
            }

        }

        System.out.println("Twój Dziekanat");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=====================");
            System.out.println("Wybierz jedną z opcji");
            System.out.println("1 - Zobacz listę nauczycieli");
            System.out.println("2 - Zobacz listę studentów");
            System.out.println("3 - Zobacz9 listę przedmotów");
            System.out.println("4 - Dodaj nauczyciela");
            System.out.println("5 - Dodaj przedmiot");
            System.out.println("6 - Dodaj studenta");
            System.out.println("7 - Lista ocen ");
            System.out.println("8 - Dodawanie ocen ");
            System.out.println("9 - Zapisz do pliku ");
            System.out.println("0 - Opuść program");

            System.out.print("Wybierz opcję: ");
            int opcja = scanner.nextInt();
            if (opcja == 1) {
                System.out.println("++++++ Lista nauczycieli +++++");

                for (Teacher teacher : teachers) {
                    System.out.println(teacher.toString());
                }
            } else if (opcja == 2) {
                System.out.println("+++++ Lista studentów +++++");
                for (Student student : students) {
                    System.out.println(student.toString());
                }
            } else if (opcja == 3) {
                System.out.println("+++++ Lista przedmiotów ++++++");

                for (Przedmiot przedmiot : przedmioty) {
                    System.out.println(przedmiot.toString());
                }

            } else if (opcja == 7) {
                System.out.println("+++++Lista Ocen+++++");
                for (Ocena ocena : oceny) {      //po prawej stronie od dwukropka jest zmienna typu Lista , po lweje stronie
                    //od dwukropka mowi ze :wez kazdy elemnt z typu lista o nazwie oceny i zapisz go w zmiennej typu Ocena
                    //o nazwie ocena i uruchom znia kod który znajduje sie miedzy klamrami
                    System.out.println(ocena.toString());
                }


            } else if (opcja == 4) {
                System.out.println("+++++++ Dodawanie nauczyciela ++++++");

                System.out.print("Podaj imie: ");
                String imie = scanner.next();
                System.out.print("Podaj nazwisko: ");
                String nazwisko = scanner.next();
                System.out.print("Podaj stopien: ");
                String stopien = scanner.next();
                System.out.print("Podaj pesel: ");
                int pesel = scanner.nextInt();

                Teacher teacher = new Teacher(imie, nazwisko, stopien, pesel);
                teachers.add(teacher);
                System.out.println("Dodano nauczyciela: " + teacher.toString());
            } else if (opcja == 5) {
                System.out.println("++++ Dodawanie przedmiotu ++++");

                System.out.print("Podaj nazwe: ");
                String nazwa = scanner.next();
                System.out.print("Podaj ECTS: ");
                int ects = scanner.nextInt();


                Przedmiot przedmiot = new Przedmiot(przedmioty.size(), nazwa, ects);
                przedmioty.add(przedmiot);
                System.out.println("Dodano przedmiot: " + przedmiot.toString());

            } else if (opcja == 6) {

                System.out.println("= Dodawanie studenta =");

                System.out.print("Podaj imie: ");
                String imie = scanner.next();
                System.out.print("Podaj nazwisko: ");
                String nazwisko = scanner.next();
                System.out.print("Podaj pesel: ");
                int pesel = scanner.nextInt();

                Student student = new Student(imie, nazwisko, pesel);
                students.add(student);
                System.out.println("Dodano studenta: " + student.toString());


            } else if (opcja == 8) {
                System.out.println("=Dodawanie ocen=");

                System.out.print("Podaj numer studenta: ");
                int nr_studenta = scanner.nextInt();
                System.out.print("Podaj numer przedmiotu ");
                int nr_przedmiotu = scanner.nextInt();
                System.out.print("Podaj ocenę");
                int ocena1 = scanner.nextInt();

                Student student = students.get(nr_studenta);
                Przedmiot przedmiot = przedmioty.get(nr_przedmiotu);


                Ocena ocena = new Ocena(oceny.size(), ocena1, student, przedmiot);
                oceny.add(ocena);
                System.out.println("Dodano ocenę" + ocena.toString());
            } else if (opcja == 9) {
                System.out.println("Zapisuję do pliku");

                BufferedWriter writer = new BufferedWriter(new FileWriter("dziekanat.txt", false));

                for (Student student : students) {
                    writer.append("# student");
                    writer.newLine();
                    writer.append(student.getImie());
                    writer.newLine();
                    writer.append(student.getNazwisko());
                    writer.newLine();
                    writer.append(student.getPesel() + "");
                    writer.newLine();
                }

                for (Teacher teacher : teachers) {
                    writer.append("# teacher");
                    writer.newLine();
                    writer.append(teacher.getImie());
                    writer.newLine();
                    writer.append(teacher.getNazwisko());
                    writer.newLine();
                    writer.append(teacher.getPesel() + "");
                    writer.newLine();
                    writer.append(teacher.stopien_naukowy);
                    writer.newLine();
                }
                for (Przedmiot przedmiot : przedmioty) {
                    writer.append("#przedmiot");
                    writer.newLine();
                    writer.append(przedmiot.getId() + "");
                    writer.newLine();
                    writer.append(przedmiot.getNazwa());
                    writer.newLine();
                    writer.append(przedmiot.getEcts() + "");
                    writer.newLine();

                }
                for (Ocena ocena:oceny){
                    writer.append("# ocena");
                    writer.newLine();
                    writer.append(ocena.getId() + "");
                    writer.newLine();
                    writer.append(ocena.getOcena()+ "");
                    writer.newLine();
                    writer.append(students.indexOf(ocena.getStudent())+"");//pobranie indeksu
                    writer.newLine();
                    writer.append(przedmioty.indexOf(ocena.getPrzedmiot()) + "");
                    writer.newLine();
                }

                writer.flush();
                writer.close();
            } else if (opcja == 0) {
                System.out.println("Koniec programu");
                break;
            } else {
                System.out.println("wybrałes zły numer");
            }
        }

        System.out.println("Do widzenia!");
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


//NAJPROSTRSZA METODA
//public void readFile(String filePath) throws IOException {
//  FileReader fileReader = new FileReader(filePath);
//  BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//  String textLine = bufferedReader.readLine();
//  do {
//    System.out.println(textLine);
//
//    textLine = bufferedReader.readLine();
//  } while(textLine != null);
//
//  bufferedReader.close();
//}

