package com.company;

public class Teacher extends Person {


    String stopien_naukowy;




    public String getStopien_naukowy() {
        return stopien_naukowy;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "stopien_naukowy='" + stopien_naukowy + '\'' +
                ", Pesel=" + Pesel +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                '}';
    }

    public Teacher(String imie, String nazwisko, String stopien_naukowy, int pesel) {
        Imie = imie;
        Nazwisko = nazwisko;
        this.stopien_naukowy = stopien_naukowy;
        this.Pesel = pesel;

    }

}
