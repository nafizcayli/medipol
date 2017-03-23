package com.medipol.oop.ders5;

import java.util.Scanner; // programda kullanilacak Siniflari once 'import' komutu ile ekliyoruz

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner nesnesinin olusturulmasi

        System.out.println("Lutfen bir sayi giriniz: ");
        int kullanicininGirdigiSayi = scanner.nextInt(); // nextInt() kullanicinin girdigi tam sayiyi donduren fonksiyon
        System.out.println(String.format("Girdiginiz sayi %d", kullanicininGirdigiSayi));
        System.out.println("Program bitti");


        System.out.println("Lutfen kesirli bir sayi giriniz:");
        float girilenKesirliSayi = scanner.nextFloat(); // nextFloat() kullanicinin girdigi kesirli sayiyi donduren fonksiyon
        System.out.println(String.format("Girdiginiz kesirli sayi %.2f", girilenKesirliSayi));
        System.out.println("Program bitti");


        System.out.println("18 yasindan buyuk musunuz?");
        boolean girilenDeger = scanner.nextBoolean(); // nextBoolean() kullanicinin girdigi true/false degerini donduren fonksiyon
        if (girilenDeger) {
            System.out.println("18 yasindan buyuksunuz!");
        } else {
            System.out.println("18 yasindan kucuksunuz!!");
        }


        System.out.println("Isminizi giriniz:");
        String girilenIsim = scanner.nextLine(); // nextLine() kullanicinin girdigi satiri String olarak donduren fonksiyon
//        Merhaba {ISIM}!
        System.out.println(String.format("Merhaba %s!", girilenIsim));

    }
}








