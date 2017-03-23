package com.medipol.oop.ders5;

public class Ucgen { // sinif tanimi
    private float birinciKenar; // sinifin bildigi degiskenler (instance variables)
    private float ikinciKenar;
    private float ucuncuKenar;

    public Ucgen() { // varsayilan (bos) yapici (constructor) methodu
        System.out.println("Ucgen nesnesi uretildi!");
    }

    public Ucgen(float ucuncuKenar) {
        this.ucuncuKenar = ucuncuKenar;
    } // bir parametreli yapici method

    public Ucgen(float birinciKenar, float ikinciKenar) { // iki parametreli yapici method
        this.birinciKenar = birinciKenar;
        this.ikinciKenar = ikinciKenar;
    }

    public Ucgen(float birinciKenar, float ikinciKenar, float ucuncuKenar) { // uc parametreli yapici method
        this.birinciKenar = birinciKenar;
        this.ikinciKenar = ikinciKenar;
        this.ucuncuKenar = ucuncuKenar;
    }

    public static void staticFonksiyon() { // Siniftan bir nesne turetmeden SinifIsmi.methodIsmi() yapisi ile kullanilan statik fonksiyon ornegi
        System.out.println("Bu fonksiyon Ucgen sinifinin static fonksiyonudur.");
    }

    public float getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(float birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    public float getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(float ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

    public float getUcuncuKenar() {
        return ucuncuKenar;
    }

    public void setUcuncuKenar(float ucuncuKenar) {
        this.ucuncuKenar = ucuncuKenar;
    }

    public void ozet() {
        System.out.println("Birinci kenar:" + this.birinciKenar);
        System.out.println("Ikinci kenar:" + this.ikinciKenar);
        System.out.println("Ucuncu kenar:" + this.ucuncuKenar);
    }

}




















