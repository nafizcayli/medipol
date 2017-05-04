package com.medipol.oop.ders10.simulasyon;

import java.util.ArrayList;

public class SimulasyonTest {
    public static void main(String[] args) {

        ArrayList<Hayvan> hayvanListesi = new ArrayList<Hayvan>();

        Aslan aslan = new Aslan();
        Kaplan kaplan = new Kaplan();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();
        Kurt kurt = new Kurt();
        Zurafa zurafa = new Zurafa();


        hayvanListesi.add(aslan);
        hayvanListesi.add(kaplan);
        hayvanListesi.add(kedi);
        hayvanListesi.add(kopek);
        hayvanListesi.add(kurt);
        hayvanListesi.add(zurafa);

        for (Hayvan hayvan : hayvanListesi) {
            hayvan.yemekYe();
            hayvan.dolas();
        }

        Veteriner veteriner = new Veteriner();
        veteriner.asiYap(kedi);
        veteriner.asiYap(zurafa);

        veteriner.hayvanlarlaOyna(kedi);
        veteriner.hayvanlarlaOyna(kopek);

    }
}















