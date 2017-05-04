package com.medipol.oop.ders10.soyutsinif;

public abstract class GeometrikSekil {
    int i;

    public abstract float alanHesapla();

    public abstract float cevreHesapla();

    public String ozet() {
        return "Abstract sinifta govdeli methodlar da bulunabilir!";
    }
}
