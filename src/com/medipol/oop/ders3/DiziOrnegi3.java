package com.medipol.oop.ders3;

/**
 * int[] sayiDizisi = {10,20,30,40,50,60}
 * dizisinin tersini barindiran dizi olusturunuz, ve bu diziyi ekrana yazdiran
 * programi olusturunuz
 */

public class DiziOrnegi3 {
    public static void main(String[] args) {
        int[] sayiDizisi = {10, 20, 30, 40, 50, 60, 70};
        int[] tersSayiDizisi = new int[sayiDizisi.length];

        for (int i = sayiDizisi.length - 1; i >= 0; i--) {
            tersSayiDizisi[(sayiDizisi.length - 1) - i] = sayiDizisi[i];
        }

        for (int i = 0; i < tersSayiDizisi.length; i++) {
            System.out.println(tersSayiDizisi[i]);
        }
    }

}
