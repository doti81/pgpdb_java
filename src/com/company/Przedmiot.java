package com.company;

public class Przedmiot {
    private final int id;
    private final String nazwa;
    private final int ects;

    public Przedmiot(int id, String nazwa, int ects) {
        this.id = id;
        this.nazwa = nazwa;
        this.ects = ects;
    }

    public int getId() {
        return id;
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
