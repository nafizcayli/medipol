package com.medipol.oop.ders10.simulasyon;

public class Veteriner {
    public void asiYap(Hayvan hayvan) {
        System.out.println("Asi yapiyorum!");
        hayvan.sesCikart();
    }

    public void hayvanlarlaOyna(Evcil hayvan) {
        hayvan.oyunOyna();
        hayvan.arkadasCanlisiOl();
    }
}
