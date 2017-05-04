package com.medipol.oop.ders10.simulasyon;

public class Kopek extends Kopekgil implements Evcil {
    @Override
    public void sesCikart() {
        System.out.println("Hav hav hav!");
    }

    @Override
    public void yemekYe() {
        System.out.println("Kemikleri yiyorum!!");
    }

    @Override
    public void arkadasCanlisiOl() {
        System.out.println("Kopek arkadas canlisi oluyor.");
    }

    @Override
    public void oyunOyna() {
        System.out.println("Topu getiriyorum..!");
    }
}
