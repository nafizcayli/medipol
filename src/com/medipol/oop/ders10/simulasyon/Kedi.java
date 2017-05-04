package com.medipol.oop.ders10.simulasyon;

public class Kedi extends  Kedigil implements Evcil{

    @Override
    public void sesCikart() {
        System.out.println("Miyav miyav!!");
    }

    @Override
    public void yemekYe() {
        System.out.println("Balik yiyorumm");
    }

    @Override
    public void arkadasCanlisiOl() {
        System.out.println("Kedi arkadas canlisi oluyor.");
    }

    @Override
    public void oyunOyna() {
        System.out.println("Yumakla oynuyorum..!");
    }
}
