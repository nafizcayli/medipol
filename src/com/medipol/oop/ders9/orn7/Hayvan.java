package com.medipol.oop.ders9.orn7;

public class Hayvan {
    public void sesCikart() {
        System.out.println("Sesim yok!");
    }

    public void beslen() {
        System.out.println("Hayvan yemek yiyor.");
    }

    public static void ozelFonksiyonlariniCagir(Hayvan hayvan) {
        if (hayvan instanceof Kedi) {
            ((Kedi) hayvan).fareyiYakala();
        } else if (hayvan instanceof Serce) {
            ((Serce) hayvan).uc();
        }

    }
}
