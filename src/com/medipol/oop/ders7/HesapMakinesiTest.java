package com.medipol.oop.ders7;

public class HesapMakinesiTest {
    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        System.out.println(hesapMakinesi.topla(2.2, 3.3));
        System.out.println(hesapMakinesi.cikart(2.2, 3.3));
        System.out.println(hesapMakinesi.carp(2.2, 3.3));
        System.out.println(hesapMakinesi.bol(2.2, 0));
        System.out.println(hesapMakinesi.karekok(3));
        System.out.println(hesapMakinesi.mod(3, 2));
    }
}
