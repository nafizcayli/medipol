package com.medipol.oop.ders9.orn5;

public class Dikdortgen extends GeometrikSekil {
    private float kisaKenar;
    private float uzunKenar;

    @Override
    public float cevreHesapla() {
        return (this.kisaKenar + this.uzunKenar) * 2;
    }

    @Override
    public float alanHesapla() {
        return this.kisaKenar * this.uzunKenar;
    }

    public float getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(float kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public float getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(float uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
