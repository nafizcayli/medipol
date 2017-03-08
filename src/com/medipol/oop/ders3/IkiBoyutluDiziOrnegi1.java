package com.medipol.oop.ders3;


/*
Vize Notu  Final Notu
80         90
90         60
30         70
50         50
30         100

  Yukaridaki vize notlarinin ve final notlarinin ortalamasini ekrana yazdiran programi yaziniz.

  vize ortalamasi = (80+90+30+50+30)/5
  final ortalamasi = (90+60+70+50+100)/5

 */

public class IkiBoyutluDiziOrnegi1 {

    public static void main(String[] args) {

        int[][] notlar = {
                {80, 90},
                {90, 60},
                {30, 70},
                {50, 50},
                {30, 100}
        };

        int toplamVizeNotlari = 0;
        int toplamFinalNotlari = 0;

        for (int i = 0; i < notlar.length; i++) {
            toplamVizeNotlari += notlar[i][0];
            toplamFinalNotlari += notlar[i][1];
        }

        System.out.println("Vize ortalamasi:" + toplamVizeNotlari / notlar.length);
        System.out.println("Final ortalamasi:" + toplamFinalNotlari / notlar.length);


    }

}














