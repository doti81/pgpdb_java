package com.company;

public abstract class Person {
    int Pesel;
    String Imie;
    String Nazwisko;

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public int getPesel() {
        return Pesel;
    }

    public void setPesel(int pesel) {
        Pesel = pesel;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }
}
