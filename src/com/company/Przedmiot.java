package com.company;

public class Przedmiot {
    private final String nazwa;
    private final int ects;

    public Przedmiot(String nazwa, int ects) {
        this.nazwa = nazwa;
        this.ects = ects;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getEcts() {
        return ects;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "nazwa='" + nazwa + '\'' +
                ", ects=" + ects +
                '}';
    }
}
