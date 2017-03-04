package com.medipol.oop.ders2;



/*
int 'satisToplam' ve int 'kazanilanYeniMusteri' değişkenleri için:

- 'satisToplam' 1000TL'den büyük eşit ise %10, küçük ise %5 prim
- 'satisToplami' 1000TL’den buyuk esit  ve 'kazanilanYeniMusteri' 5’ten buyuk esit ise araba, 'satisToplami' 1000TL’den buyuk esit  ve 'kazanilanYeniMusteri' 5’ten kucuk, 3ten buyuk esit ise ekstra tatil kazaniliyor.

Bu kurallara gore kazanilan prim ve tatil’i kullaniciya bildiren bir program yaziniz.


Örnek Program Çıktısı:
--------------------------------
satisToplam = 2000
kazanilanYeniMusteri = 10

%10 prim alacaksiniz
Araba kazandiniz
--------------------------------
--------------------------------
satisToplam = 1800
kazanilanYeniMusteri = 4

%10 prim alacaksiniz
Tatil kazandiniz
--------------------------------
 */

public class IfOrnegi1 {
    public static void main(String[] args) {
        int satisToplam = 1500;
        int kazanilanYeniMusteri = 40;

        if (satisToplam >= 1000) {
            System.out.println("%10 prim alacaksiniz");
            if (kazanilanYeniMusteri >= 5) {
                System.out.println("Araba kazandiniz!");
            } else if (kazanilanYeniMusteri >= 3) {
                System.out.println("Tatil kazandiniz!");
            }
        } else {
            System.out.println("%5 prim alacaksiniz");
        }

        System.out.println("Program bitti.");
    }
}
