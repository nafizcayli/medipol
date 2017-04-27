package com.medipol.oop.ders9.orn5;

public class Daire extends GeometrikSekil  {
    private float yariCap;

    @Override
    public float cevreHesapla() {
        return 2 * 3.14f * this.yariCap;
    }

    @Override
    public float alanHesapla() {
        return 3.14f * this.yariCap * this.yariCap;
    }

    public float getYariCap() {
        return yariCap;
    }

    public void setYariCap(float yariCap) {
        this.yariCap = yariCap;
    }
}
