package com.medipol.oop.ders2;

/*
int sayi1 , int sayi2 degiskenleri icin:
Sayilar carpildiginda sonucun negatif mi pozitif mi yoksa sifir mi olacagini ekrana yazdiran program yaziniz.

- - = +
+ - = -
- + = -
+ + = +
0 0 = 0


Örnek Program Çıktısı:
--------------------------------
sayi1 = 10
sayi2 = -5

Carpimlar negatiftir
--------------------------------
--------------------------------
sayi1 = -10
sayi2 = -5

Carpimlar pozitiftir
--------------------------------
 */

public class IfOrnegi2 {

    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;

        if ((sayi1 > 0 && sayi2 > 0) || (sayi1 < 0 && sayi2 < 0)) {
            System.out.println("Carpimlar pozitiftir");
        } else if ((sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0)) {
            System.out.println("carpimlar negatiftir");
        } else {
            System.out.println("Carpimlar sifirdir");
        }

        System.out.println("Program bitti.");
    }
}
