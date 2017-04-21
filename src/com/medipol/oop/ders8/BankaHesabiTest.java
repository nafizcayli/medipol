package com.medipol.oop.ders8;

public class BankaHesabiTest {
    public static void main(String[] args) {
        Adres adres = new Adres("acik adres satiri1", "Istanbul", "Turkiye", 34760);
        Kisi kisi = new Kisi("Nafiz", "Cayli", 1111111, adres);

        BankaHesabi bankaHesabi = new BankaHesabi(kisi);

        System.out.println(bankaHesabi.getKisi().getSoyisim());
        System.out.println(bankaHesabi.getKisi().getTcNo());
        System.out.println(bankaHesabi.getKisi().getAdres().getUlke());
        System.out.println(bankaHesabi.getKisi().getAdres().getPostaKodu());

    }
}
