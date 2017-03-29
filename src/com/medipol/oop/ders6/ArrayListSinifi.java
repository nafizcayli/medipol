package com.medipol.oop.ders6;

import java.util.ArrayList;

public class ArrayListSinifi {
    public static void main(String[] args) {

        ArrayList<String> stringListesi = new ArrayList<String>(); // String nesnelerini barindiracak ArrayList nesnemizi olusturuyoruz
        stringListesi.add("Ali"); // add() fonksiyonu ile ArrayList nesnemize eleman ekliyoruz
        stringListesi.add("Veli");
        stringListesi.add("Elif");
        stringListesi.add("Ebru");
        stringListesi.add(0, "Hasan"); // add(int index, E element) fonksiyonu ile belirttigimiz index'e eleman ekliyoruz

        for (int i = 0; i < stringListesi.size(); i++) { // klasik for dongusu ile ArrayList icerigini ekrana yazdiriyoruz
            System.out.println(String.format("%d- %s", i + 1, stringListesi.get(i)));
        }

        for (String eleman : stringListesi) { // gelismis for dongusu ile ArrayList icerigini ekrana yazdiriyoruz
            System.out.println(eleman);
        }

        String eleman = stringListesi.get(1); // get(int index) fonksiyonu ile verilen index'teki elemani listeden okuyoruz
        System.out.println(eleman);

        int elemanSayisi = stringListesi.size(); // size() fonksiyonu ile listenin eleman sayisini okuyoruz
        System.out.println(elemanSayisi);

        stringListesi.remove(0); // remove(int index) fonksiyonu ile listenin verilen index'teki elemanini siliyoruz
        stringListesi.remove("Ebru"); // remove(Object o) fonksiyonu ile verilen nesneyi listeden siliyoruz

        System.out.println(stringListesi.size());
        System.out.println(stringListesi.get(0));

        boolean varMi1 = stringListesi.contains("Ebru"); //contains(Object o) fonksiyonu ile verilen nesne listede var mi
        boolean varMi2 = stringListesi.contains("ebru"); // yok mu kontrol ediyoruz
        System.out.println(varMi1);
        System.out.println(varMi2);

        int index = stringListesi.indexOf("Ebru"); // indexOf(Object o) fonksiyonu ile verilen nesnenin listedeki index'ini buluyoruz
        System.out.println(index);

        stringListesi.clear(); // clear() fonksiyonu ile listenin butun elemanlarini bosaltiyoruz (listeyi sifirliyoruz)
        System.out.println(stringListesi.size());


    }
}












