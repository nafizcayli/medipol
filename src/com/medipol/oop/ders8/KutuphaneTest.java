package com.medipol.oop.ders8;

public class KutuphaneTest {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();

        Yazar yazar1 = new Yazar("George", "Orwell");
        Yazar yazar2 = new Yazar("Stephen", "King");

        Kitap kitap1 = new Kitap("1984", 250, yazar1);
        Kitap kitap2 = new Kitap("Hayvanlar Ciftligi", 150, yazar1);
        Kitap kitap3 = new Kitap("Karakule", 400, yazar2);

        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapEkle(kitap3);

        kutuphane.ozet();
        kutuphane.kitapCikart(kitap2);
        kutuphane.ozet();

        System.out.println(kutuphane.kitapBul("1984").getYazar().getSoyismi());
        System.out.println(kutuphane.kitapBul("Karakule").getSayfaSayisi());
    }
}




















