package com.medipol.oop.ders3;

public class IkiBoyutluDiziler {

    /*
    Iki boyutlu diziler genelde tablo seklindeki degerleri ifade etmek icin kullanilir. Ornegin asagidaki ogrencilerin
    vize ve final notlarini 2 boyutlu bir dizi yardimiyla ifade edebiliriz.

        Ogrenci Ismi   Vize Notu  Final Notu
        Ahmet          80         90
        Esin           90         60
        Hasan          30         70
        Ebru           50         50
        Elif           30         100
 */

    public static void main(String[] args) {
        int[][] notlar = new int[5][2]; // ilk rakam satir sayisini, ikinci rakam sütun sayisini belirtir

        notlar[0][0] = 80; // ilk satirin ilk sütunun degerini 80 olarak atar
        notlar[0][1] = 90; // ilk satirin ikinci sütunun degerini 90 olarak atar

        notlar[1][0] = 90; // ikinci satirin ilk sütunun degerini 90 olarak atar
        notlar[1][1] = 60; // ikinci satirin ikinci sütunun degerini 60 olarak atar


//        Degerleri yukaridaki gibi tek tek tanimlayabildigimiz gibi, asagidaki sekilde de tanimlayabilirdik

        int[][] notlar2 = {
                {80, 90}, // ilk ogrencinin sirasiyla vize ve final notu
                {90, 60}, // ikinci ogrencinin sirasiyla vize ve final notu
                {30, 70}, // ucuncu ogrencinin sirasiyla vize ve final notu
                {50, 50}, // dorduncu ogrencinin sirasiyla vize ve final notu
                {30, 100} // besinci ogrencinin sirasiyla vize ve final notu
        };


//        Iki boyutlu dizilerin degerlerine ulasmak yine tek boyutlu dizilerdeki gibi index ile olur
//        Tek boyutlu dizilerden farkli olarak 2 adet index girilir. Birincisi 'satir' sayisi, ikincisi 'sutun' sayisini belirtir.


        System.out.println(notlar2[2][1]); // 3. satir, 2. sütun degerini ekrana yazdirir
        System.out.println(notlar2[4][1]); // 5. satir, 2. sütun degerini ekrana yazdirir
        System.out.println(notlar2[1][0]); // 2. satir, 1. sütun degerini ekrana yazdirir


        int[][] notlar3 = {
                {80, 50, 90},
                {90, 60, 60},
                {30, 70, 70},
                {50, 80, 50},
                {30, 90, 100}
        };


        System.out.println(notlar3[2][2]); // 3. satir, 3. sütun degerini ekrana yazdirir
        System.out.println(notlar3[0][2]); // 1. satir, 3. sütun degerini ekrana yazdirir
        System.out.println(notlar3[3][1]); // 4. satir, 2. sütun degerini ekrana yazdirir


//        Ic ice 2 adet for dongusu kullanarak iki boyutlu dizilerin icerisindeki butun degerleri ekrana yazdirabiliriz
        for (int i = 0; i < notlar2.length; i++) {
            for (int j = 0; j < notlar2[i].length; j++) {
                System.out.println(notlar2[i][j]);
            }
        }


    }
}
