package com.medipol.oop.ders9.orn6oop;

public class Test {
    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setIsim("Nafiz");
        ogretmen.setSoyisim("Cayli");
        ogretmen.setMaas(150);
        ogretmen.setDers("Nesne yonelimli programlama");


        TemizlikGorevlisi temizlikGorevlisi = new TemizlikGorevlisi();
        temizlikGorevlisi.setIsim("Omer");
        temizlikGorevlisi.setSoyisim("Koc");
        temizlikGorevlisi.setMaas(200);
        temizlikGorevlisi.setGorevliOlduguKat(3);

        ogretmen.ozet();
        temizlikGorevlisi.ozet();

    }
}
