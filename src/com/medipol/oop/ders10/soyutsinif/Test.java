package com.medipol.oop.ders10.soyutsinif;

public class Test {
    public static void main(String[] args) {

//        GeometrikSekil geometrikSekil = new GeometrikSekil();  --> GeometrikSekil sinifi abstract olarak tanimlandigi
//                                                                   icin bu ifade hata verecektir.

        Kare kare = new Kare();
        kare.setKenar(5);

        System.out.println(kare.alanHesapla());
        System.out.println(kare.cevreHesapla());

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setUzunKenar(10);
        dikdortgen.setKisaKenar(5);

        System.out.println(dikdortgen.alanHesapla());
        System.out.println(dikdortgen.cevreHesapla());
    }

}
