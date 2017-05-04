package com.medipol.oop.ders10.soyutsinif;

public class Kare extends GeometrikSekil {
    private float kenar;

    public float getKenar() {
        return kenar;
    }

    public void setKenar(float kenar) {
        this.kenar = kenar;
    }

    @Override
    public float alanHesapla() {
        return this.kenar * this.kenar;
    }

    @Override
    public float cevreHesapla() {
        return 4 * this.kenar;
    }

}
