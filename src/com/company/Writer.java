package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    static void write(List<Teacher> teachers, List<Przedmiot> przedmioty, List<Student> students, List<Ocena> oceny) throws IOException {
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
    }
}
