package com.medipol.oop.ders9.orn7;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Hayvan kedi = new Kedi();
        kedi.beslen();
        kedi.sesCikart();


        Hayvan serce = new Serce();
        serce.beslen();
        serce.sesCikart();


        ArrayList<Hayvan> hayvanListesi = new ArrayList<Hayvan>();
        hayvanListesi.add(kedi);
        hayvanListesi.add(serce);

        for (Hayvan hayvan : hayvanListesi) {
            Hayvan.ozelFonksiyonlariniCagir(hayvan);
        }


    }
}


















