package com.company;

public class Ocena {
    private final int id;
    private final int ocena;
    private final Student student;
    private final Przedmiot przedmiot;

    @Override
    public String toString() {
        return "Ocena{" +
                "ocena=" + ocena +
                ", student=" + student.toString() +
                ", przedmiot=" + przedmiot.toString() +
                '}';
    }

    public Ocena(int id, int ocena, Student student, Przedmiot przedmiot) {
        this.id = id;
        this.ocena = ocena;


        this.student = student;
        this.przedmiot = przedmiot;
    }

    public int getId() {
        return id;
    }

    public int getOcena() {
        return ocena;
    }

    public Student getStudent() {
        return student;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }
}


