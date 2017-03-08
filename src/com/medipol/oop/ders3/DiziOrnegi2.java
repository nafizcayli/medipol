package com.medipol.oop.ders3;

/**
 * int[] sayiDizisi = {10,20,2,46,7,12,4,6,8,123,2,55,21,22};
 * dizisi icin dizinin toplamini ekrana yazan programi yaziniz
 */
public class DiziOrnegi2 {
    public static void main(String[] args) {
        int[] sayiDizisi = {10, 20, 2, 46, 7, 12, 4, 6, 8, 123, 2, 55, 21, 22};
        int toplam = 0;

        for (int i = 0; i < sayiDizisi.length; i++) {
            toplam = toplam + sayiDizisi[i];
        }

        System.out.println(toplam);

    }
}
