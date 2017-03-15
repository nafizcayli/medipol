package com.medipol.oop.ders4;// Burada RobotKopek isimli sinifimizi olusturuyoruz.
// RobotKopek sadece normal bir sinif, ana methodu yok. Bu yuzden bu sinifi test etmek icin RobotKopekTest isimli
// bir sinif daha olusturup, onun ana methodu icerisinde bu RobotKopek sinifimizi test edecegiz.

public class RobotKopek { // Sinif tanimi
    // Nesnenin bilgi sahibi oldugu degiskenler (instance variables)
    private String isim; // private oldugundan bu sinif disindan . (nokta) operatoru ile ulasilmasini engelledik
    private int yas; // cunku kapsulleme yapip degiskenlerin uzerinde daha fazla kontrole sahip olabilmek icin

    public String getIsim() { //kapsulleme yaptigimiz icin bu degiskenin degerini nesneden almak icin yazdigimiz fonksiyon.
        return isim;
    }

    public void setIsim(String kopeginIsmi) { // kapsulleme yaptigimiz icin bu degiskenin degerini bu fonksiyon araciligiyla girebiliyoruz.
        isim = kopeginIsmi;
    }

    public int getYas() {//kapsulleme yaptigimiz icin bu degiskenin degerini nesneden almak icin yazdigimiz fonksiyon.
        return yas;
    }

    public void setYas(int kopeginyasi) {  // kapsulleme yaptigimiz icin bu degiskenin degerini bu fonksiyon araciligiyla girebiliyoruz.
        if (kopeginyasi > 0) { // bu da bize degiskenin degeri uzerinde daha fazla kontrol sagliyor.
            yas = kopeginyasi;
        } else {
            System.out.println("Yas sifirdan buyuk olmalidir");
        }
    }

    public void havla(int havlamaSayisi) { // bir parametreli, donus degeri olmayan (void) fonksiyon tanimladik
        for (int i = 0; i < havlamaSayisi; i++) {
            if (yas > 12) {
                System.out.println("Wuff!");
            } else {
                System.out.println("Hevv!");
            }
        }
    }

    public String terlikGetir() { // parametresiz, deger donebilen fonksiyon tanimi
        String terlikNesnesi = "Terlik";
        return terlikNesnesi;
    }


    public String getir(String getirilecekEsya) { // bir parametreli, deger donen fonksiyon tanimi
        return getirilecekEsya;
    }

    public int getir(int getirilecekSayi) { // bir parametreli, deger donen fonksiyon tanimi
        return getirilecekSayi;
    }

    // yukarida ayni isme sahip, iki farkli fonksiyon tanimladik. Parametre tipleri ya da parametre sayilari farkli oldugu surece
    // ayni isimle fonksiyon tanimlayabiliriz. Buna fonksiyon asiri yuklemesi denir.

    public int topla(int sayi1, int sayi2) { // iki parametreli, deger donen fonksiyon tanimi
        int toplam = sayi1 + sayi2;
        System.out.println("Iki parametreli toplam fonksiyonu calisti");
        return toplam;
    }

    public int topla(int sayi1, int sayi2, int sayi3) { // uc parametreli, deger donen fonksiyon tanimi
        System.out.println("Uc parametreli toplam fonksiyonu calisti");
        return sayi1 + sayi2 + sayi3;
    }

    public int birCikart(int sayi) {
        sayi = sayi - 1;
        return sayi;
    }

}








