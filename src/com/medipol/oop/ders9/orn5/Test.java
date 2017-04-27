package com.medipol.oop.ders9.orn5;

public class Test {
    public static void main(String[] args) {
        GeometrikSekil geometrikSekil = new GeometrikSekil();

        System.out.println(geometrikSekil.cevreHesapla());
        System.out.println(geometrikSekil.alanHesapla());

        Kare kare = new Kare();
        kare.setKenar(5);

        System.out.println(kare.cevreHesapla());
        System.out.println(kare.alanHesapla());

        Daire daire = new Daire();
        daire.setYariCap(2.4f);

        System.out.println(daire.cevreHesapla());
        System.out.println(daire.alanHesapla());


        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setKisaKenar(5);
        dikdortgen.setUzunKenar(10);

        System.out.println(dikdortgen.cevreHesapla());
        System.out.println(dikdortgen.alanHesapla());


        if (dikdortgen instanceof Dikdortgen) {
            System.out.println("Bu sinif Dikdortgen sinifinin bir uyesi");
        }

        if (dikdortgen instanceof GeometrikSekil) {
            System.out.println("Bu sinif GeometrikSekil sinifinin bir uyesi");
        }
    }
}
















