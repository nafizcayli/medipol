package com.medipol.oop.ders3;

 /*

        Ogrenci Ismi   Vize Notu  Final Notu
        Ahmet          80         90
        Esin           90         60
        Hasan          30         70
        Ebru           50         50
        Elif           30         100

Yukaridaki tabloda ogrenciler ve sinavlardan aldigi notlar verilmistir.

 Bir ogrencinin ders ortalamasi, vize notunun %40'i ve final notunun %60'i alinarak hesaplaniyor.
 Ogrencinin dersten gecebilmesi icin, ders ortalamasi notu 60 veya daha fazla olmasi gerekmektedir.
 Ogrencilerin gecme ve kalma durumlarini isimleri ile birlikte cikti olarak veren programi yaziniz.
 */

public class IkiBoyutluDiziOrnegi2 {
    public static void main(String[] args) {

        String[] isimler = {"Ahmet", "Esin", "Hasan", "Ebru", "Elif"};
        int[][] notlar = {
                {80, 90},
                {90, 60},
                {30, 70},
                {50, 50},
                {30, 100}
        };

        for (int i = 0; i < notlar.length; i++) {
//            System.out.println("Ogrenci ismi: "+isimler[i]+ " | Vize Notu: "+ notlar[i][0] + " Final Notu: "+notlar[i][1]);

//            Vize notu %40, Final notu %60 etkiliyor.
            float notOrtalamasi = (notlar[i][0] * 0.4f) + (notlar[i][1] * 0.6f);
//            System.out.println("Ogrenci ismi: " + isimler[i] + " | Ortalamasi: " + notOrtalamasi);

            if (notOrtalamasi >= 60) { // gecme kosulu
                System.out.println("Ogrenci ismi:" + isimler[i] + " Gecme durumu: Gecti");
            } else { // kalacak
                System.out.println("Ogrenci ismi:" + isimler[i] + " Gecme durumu: Kaldi");
            }

        }

    }
}
