package com.medipol.oop.ders2;


/*
 *  100'den 500'e kadar 16 ile tam bolunebilen sayilarin toplamini yazan program yaziniz
 */

public class ForOrnegi3 {
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 100; i < 500; i++) {
            if (i % 16 == 0) {
                toplam += i;
            }
        }

        System.out.println(toplam);

    }
}
