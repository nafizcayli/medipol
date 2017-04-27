package com.medipol.oop.ders9.orn1;

public class Bisiklet extends Arac {
    String modelTipi;

    public void ozet() {
        aracTipi = "Bisiklet";
        modelTipi = "Dag Bisikleti";

        System.out.println(String.format("orn1.Arac tipi: %s, Model tipi: %s", aracTipi, modelTipi));
    }

    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.ozet();
    }
}
