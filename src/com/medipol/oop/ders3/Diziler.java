package com.medipol.oop.ders3;

public class Diziler {
    public static void main(String[] args) {

//        Diziler, ayni turdeki degisken tiplerini sirali bir sekilde
// depolayan sabit boyutlu veri yapilaridir.
//        Sabit boyutlu, yani dizilerin boyutlari tanimlandiktan sonra
// degistirilemezler.
//        Diziler index temelli calisirlar. Indexler 0’dan baslar.Yani bir
// dizinin ilk elemaninin indexi 0, son elemanin indexi elemanSayisi - 1 dir.

//        Dizi Degiskeni Tanimlamak
//        degiskenTipi[] degiskenIsmi = new degiskenTipi[elemanSayisi]


//        Dizi degiskenlerinin tipki diger degisken tanimlamalari gibi
// farkli yollari vardir

//      Iki satirda tanimlama
        int[] sayiDizisi1;
        sayiDizisi1 = new int[5];
        sayiDizisi1[0] = 1; // dizinin ilk elemanina '1' degerini atar
        sayiDizisi1[1] = 2; // dizinin ikinci elemanina '2' degerini atar
        sayiDizisi1[2] = 3; // dizinin ucuncu elemanina '3' degerini atar
        sayiDizisi1[3] = 4; // dizinin dorduncu elemanina '4' degerini atar
        sayiDizisi1[4] = 5; // dizinin besinci elemanina '5' degerini atar

//        Tek satirda tanimlama
        boolean[] booleanDizisi = new boolean[5];
        booleanDizisi[0] = true; // dizinin ilk elemanina 'true' degerini atar
        booleanDizisi[1] = false; // dizinin ikinci elemanina 'false' degerini atar
        booleanDizisi[2] = true; // dizinin ucuncu elemanina 'true' degerini atar
        booleanDizisi[3] = true; // dizinin dorduncu elemanina 'true' degerini atar
        booleanDizisi[4] = false; // dizinin besinci elemanina 'false' degerini atar

//        Degerleri ile birlikte tanimlama
        float[] floatDizisi = {11.3f, 23.5f, 106.12f}; // dizinin ilk elemani 11.3, ikinci elemani 23.5, ucuncu elemani 106.12 degerine sahiptir.


//        Dizinin elemanlarina ulasmak icin ulasilmak istenilen elemanin indis'i kullanilir.
//        Indisler 0'dan baslar.
        System.out.println(sayiDizisi1[0]); //dizinin ilk elemanini yazdirir
        System.out.println(sayiDizisi1[1]); //dizinin ikinci elemanini yazdirir
        System.out.println(sayiDizisi1[2]); //dizinin ucuncu elemanini yazdirir
        System.out.println(sayiDizisi1[3]); //dizinin dorduncu elemanini yazdirir
        System.out.println(sayiDizisi1[4]); //dizinin besinci elemanini yazdirir

//        Dizilerin 'length' ozelligi ile boyutlarini ogrenebiliriz.
        System.out.println(sayiDizisi1.length); // sayiDizisi1'in eleman sayisini verir

//        for dongusu ile bir dizinin butun elemanlari ekrana yazdirabiliriz
        for (int i = 0; i < sayiDizisi1.length; i++) {
            System.out.println(sayiDizisi1[i]);
        }

    }
}
