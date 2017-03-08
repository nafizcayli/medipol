package com.medipol.oop.ders3;

public class StringSinifi {
    public static void main(String[] args) {

        String isim = "Nafiz";
        String soyisim = "Cayli";

        System.out.println("Benim ismim " + isim + " ve soyismim " + soyisim);

        int ogrenciSayisi = 20;
        System.out.println("Su anda sinifta " + ogrenciSayisi + " adet ogrenci var");


        String[] isimler = {"Nafiz", "Cem", "Emre", "Umut", "Hatice"}; // String nesnelerinden olusan dizi ornegi
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }

    }
}
