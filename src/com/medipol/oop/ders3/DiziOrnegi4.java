package com.medipol.oop.ders3;

/**
 * int[] sayiDizisi = {10,20,46,7,12,2,4,6,8,123,2,55,21,22}
 * dizisinin en kucuk degerini ekrana yazdiran programi yaziniz
 */
public class DiziOrnegi4 {
    public static void main(String[] args) {
        int[] sayiDizisi = {10, 20, 46, 7, 12, 2, 4, 6, 8, 123, 2, 55, 21, 22};

        int enKucukSayi = sayiDizisi[0];
        int enBuyukSayi = sayiDizisi[0];

        for (int i = 0; i < sayiDizisi.length; i++) {
            if (sayiDizisi[i] < enKucukSayi) {
                enKucukSayi = sayiDizisi[i];
            } else if (sayiDizisi[i] > enBuyukSayi) {
                enBuyukSayi = sayiDizisi[i];
            }
        }

        System.out.println(enKucukSayi);
        System.out.println(enBuyukSayi);
    }

}
