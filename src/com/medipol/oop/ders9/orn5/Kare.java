package com.medipol.oop.ders9.orn5;

public class Kare extends GeometrikSekil {
    private float kenar;

    @Override
    public float cevreHesapla() {
        return 4 * this.kenar;
    }

    @Override
    public float alanHesapla() {
        return this.kenar * this.kenar;
    }

    public float getKenar() {
        return kenar;
    }

    public void setKenar(float kenar) {
        this.kenar = kenar;
    }
}
