package com.company;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Uczen Nr1 = new Uczen("Bereza");
        Uczen Nr2 = new Uczen("Makota");
        Uczen Nr3 = new Uczen("Bryła");
        List<Uczen> listaUczniow = new ArrayList<>();
        listaUczniow.add(Nr1);
        listaUczniow.add(Nr2);
        listaUczniow.add(Nr3);
        Ocena P1 = new Ocena(Wyklad.Programowanie, 1);
        Ocena P2 = new Ocena(Wyklad.Programowanie, 2);
        Ocena P3 = new Ocena(Wyklad.Programowanie, 3);
        Ocena P4 = new Ocena(Wyklad.Programowanie, 4);
        Ocena P5 = new Ocena(Wyklad.Programowanie, 5);

        Ocena SO1 = new Ocena(Wyklad.SystemyOperacyjne, 1);
        Ocena SO2 = new Ocena(Wyklad.SystemyOperacyjne, 2);
        Ocena SO3 = new Ocena(Wyklad.SystemyOperacyjne, 3);
        Ocena SO4 = new Ocena(Wyklad.SystemyOperacyjne, 4);
        Ocena SO5 = new Ocena(Wyklad.SystemyOperacyjne, 5);

        Ocena BD1 = new Ocena(Wyklad.BazyDanych, 1);
        Ocena BD2 = new Ocena(Wyklad.BazyDanych, 2);
        Ocena BD3 = new Ocena(Wyklad.BazyDanych, 3);
        Ocena BD4 = new Ocena(Wyklad.BazyDanych, 4);
        Ocena BD5 = new Ocena(Wyklad.BazyDanych, 5);

        Nr1.wstawOcena(BD1);
        Nr1.wstawOcena(BD5);
        Nr1.wstawOcena(BD4);

        Nr2.wstawOcena(P1);
        Nr2.wstawOcena(P4);

        Nr3.wstawOcena(SO2);
        Nr3.wstawOcena(SO3);
        Nr3.wstawOcena(SO5);
        Nr3.wstawOcena(BD3);

        //implementacja interfejsu Comparator z użyciem wyrażenia lambda
        listaUczniow.sort((o1, o2) -> o1.getNazwisko().compareTo(o2.getNazwisko()));

        for(Uczen s : listaUczniow) {
            s.sredniaUczen(s.getNazwisko());
        }
    }
}