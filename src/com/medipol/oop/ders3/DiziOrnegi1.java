package com.medipol.oop.ders3;

/**
 * int[] sayiDizisi = {10,20,2,46,7,12,4,6,8,123,55,21,22}
 * ve int tipindeki 'bulunacakSayi' degiskeni icin;
 * bulunacakSayi degiskenindeki degerin, sayiDizisi icindeki 'index'ini veren programi yaziniz
 */

public class DiziOrnegi1 {
    public static void main(String[] args) {
        int[] sayiDizisi = {10, 20, 2, 46, 7, 12, 4, 6, 8, 123, 55, 21, 22};
        int bulunacakSayi = 123;

        for (int i = 0; i < sayiDizisi.length; i++) {
            if (sayiDizisi[i] == bulunacakSayi) {
                System.out.println(i);
            }
        }

    }
}










