package com.company;

import java.util.*;

public class Uczen {
    private String nazwisko;

    private List<Ocena> oceny;

    static LinkedHashMap<String, Double> dziennik = new LinkedHashMap<>();

    public Uczen(String nazwisko) {
        this.nazwisko = nazwisko;
        oceny = new ArrayList<>();
        dziennik.put(nazwisko, average());
    }

    public void wstawOcena(Ocena ocena) {
        oceny.add(ocena);
    }

    public void sredniaUczen(String s) {
        System.out.println(nazwisko);
        int ilosc = 0;
        int suma = 0;
        for (Ocena ocena : oceny) {
            if(s.equals(nazwisko))
                suma += ocena.ocena;
            ilosc++;
        }

        System.out.println("Srednia = " + (double) suma/ilosc);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double average() {
        if (oceny.size() == 0) return 0;
        int suma = 0;
        for (Ocena ocena : oceny) {
            suma += ocena.ocena;
        }
        return (double) suma / oceny.size();
    }

    public void ListaPoImie() {
        System.out.println("Nazwisko: " + nazwisko);

        for(Map.Entry<String, Double> wyklad : dziennik.entrySet()) {
            System.out.println("Przedmiot " + wyklad.getKey() + ", " + wyklad.getValue());
        }
    }
}