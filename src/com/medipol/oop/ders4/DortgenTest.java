package com.medipol.oop.ders4;

public class DortgenTest {
    public static void main(String[] args) {
        Dortgen dortgen1 = new Dortgen();

        dortgen1.setKisaKenar(20);
        dortgen1.setUzunKenar(-30);

        System.out.println("Kisa kenar: " + dortgen1.getKisaKenar());
        System.out.println("Uzun kenar: " + dortgen1.getUzunKenar());

        System.out.println("Dortgenin alani: " + dortgen1.alaniHesapla());
        System.out.println("Dortgenin cevresini: " + dortgen1.cevresiniHesapla());

        System.out.println("Dortgenim kare mi?: " + dortgen1.kareMi());


        Dortgen dortgen2 = new Dortgen();

        dortgen2.setKisaKenar(20);
        dortgen2.setUzunKenar(20);

        System.out.println("Kisa kenar: " + dortgen2.getKisaKenar());
        System.out.println("Uzun kenar: " + dortgen2.getUzunKenar());

        System.out.println("Dortgenin alani: " + dortgen2.alaniHesapla());
        System.out.println("Dortgenin cevresini: " + dortgen2.cevresiniHesapla());

        System.out.println("Dortgenim kare mi?: " + dortgen2.kareMi());

    }
}
