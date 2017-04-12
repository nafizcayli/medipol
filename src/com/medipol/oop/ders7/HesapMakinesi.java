package com.medipol.oop.ders7;

public class HesapMakinesi {
    public double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public double cikart(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    public double bol(double sayi1, double sayi2) {
        if (sayi2 == 0) {
            System.out.println("Sifirla bolum tanimsizdir");
            return sayi1;
        } else {
            return sayi1 / sayi2;
        }
    }

    public double carp(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    public double karekok(double sayi1) {
        if (sayi1 < 0) {
            System.out.println("Negatif sayinin karekoku reel degildir");
            return sayi1;
        } else {
            return Math.sqrt(sayi1);
        }
    }

    public double mod(double sayi1, double sayi2) {
        return sayi1 % sayi2;
    }

}











