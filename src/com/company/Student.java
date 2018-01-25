package com.company;

public class Student extends Person {


    public Student(String imie, String nazwisko, int pesel) {
        Imie = imie;
        Nazwisko = nazwisko;
        Pesel = pesel;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Pesel=" + Pesel +
                '}';
    }


}
