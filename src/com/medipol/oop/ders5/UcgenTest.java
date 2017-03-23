package com.medipol.oop.ders5;

public class UcgenTest {
    public static void main(String[] args) {
        Ucgen ucgen1 = new Ucgen();
        ucgen1.setBirinciKenar(10.5f);
        ucgen1.setIkinciKenar(12.3f);
        ucgen1.setUcuncuKenar(20.2f);
        ucgen1.ozet();

        Ucgen ucgen2 = new Ucgen(10.5f, 12.3f, 20.2f);
        ucgen2.ozet();

        Ucgen ucgen3 = new Ucgen(10.5f, 3.4f);
        ucgen3.setUcuncuKenar(20f);
        ucgen3.ozet();

        Ucgen.staticFonksiyon(); // statik fonksiyon kullanimi
    }
}
