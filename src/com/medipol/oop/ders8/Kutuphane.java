package com.medipol.oop.ders8;

import java.util.ArrayList;

public class Kutuphane {
    private ArrayList<Kitap> kitapListesi;

    public Kutuphane() {
        kitapListesi = new ArrayList<Kitap>();
    }

    public ArrayList<Kitap> getKitapListesi() {
        return kitapListesi;
    }

    public void setKitapListesi(ArrayList<Kitap> kitapListesi) {
        this.kitapListesi = kitapListesi;
    }

    public void kitapEkle(Kitap kitap) {
        kitapListesi.add(kitap);
    }

    public void kitapCikart(Kitap kitap) {
        kitapListesi.remove(kitap);
    }

    public void ozet() {
        System.out.println(String.format("Kutuphanede %d kitap var", kitapListesi.size()));
    }

    public Kitap kitapBul(String kitapIsmi) {
        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapListesi.get(i).getIsim().equals(kitapIsmi)) {
                return kitapListesi.get(i);
            }
        }
        return null;
    }

}














