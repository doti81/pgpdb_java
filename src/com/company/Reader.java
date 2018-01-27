package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Reader {
    static void read(BufferedReader reader, List<Teacher> teachers, List<Przedmiot> przedmioty, List<Student> students, List<Ocena> oceny) throws IOException {
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
    }
}
