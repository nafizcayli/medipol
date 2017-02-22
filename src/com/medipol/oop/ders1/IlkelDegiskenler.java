package com.medipol.oop.ders1;

public class IlkelDegiskenler {

    public static void main(String[] args) {
//        Ilkel Degiskenler
//
//        boolean	true/false
//        char		0’dan 65535’e
//
//        Tam Sayılar
//        byte		-128’den 127’e kadar değer alıyor.
//        short		-32.768’den 32767’e kadar değer alıyor.
//        int		-2.147.483.648’den 2.147.483.647’e kadar değer alıyor.
//        long		-2^63  ile 2^63 - 1 arasında değer alıyor.
//
//        Kesirli Sayılar
//        float		Java sürümüne göre değişiyor.
//        double	Java sürümüne göre değişiyor.


        boolean sicakMi;
        sicakMi = true;

        System.out.println(sicakMi);

        boolean sogukMu = false;

        System.out.println(sogukMu);

        char cHarfi = 'c';
        System.out.println(cHarfi);

        char kHarfi, lHarfi;
        kHarfi = 'k';
        lHarfi = 'l';

        char mHarfi = 'm', nHarfi = 'n';

        System.out.println(kHarfi);
        System.out.println(lHarfi);
        System.out.println(mHarfi);
        System.out.println(nHarfi);

        byte b = 10;
        short s = 500;

        System.out.println(b);
        System.out.println(s);

        int yuzSayisi = 100;
        long longDegiskeni = 5000000;
        float kesirliSayi = 1.2f;
        double kesirliIkinciSayi = 1.2;

        System.out.println(yuzSayisi);
        System.out.println(longDegiskeni);
        System.out.println(kesirliSayi);
        System.out.println(kesirliIkinciSayi);


        int y = 20;
        int z = 10;

        System.out.println(z);
        z = y;
        System.out.println(z);


    }

}
