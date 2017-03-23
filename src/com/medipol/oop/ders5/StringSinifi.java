package com.medipol.oop.ders5;

public class StringSinifi {
    public static void main(String[] args) {

        String yazi = new String("merhaba dunya!"); // yeni String nesnesi olusturma
        System.out.println(yazi);

        char[] karakterDizisi = {'m', 'e', 'r', 'h', 'a', 'b', 'a', ' ', 'd', 'u', 'n', 'y', 'a', '!'};
        String yazi2 = new String(karakterDizisi); // String sinifinin (char[] value) parametresine sahip yapici methodu ile nesne olusturma
        System.out.println(yazi2);

        String yazi3 = new String(karakterDizisi, 3, 5); // (char value[], int offset, int count) yapici methodu ile nesne olusturma
        System.out.println(yazi3);

        String yazi4 = "merhaba dunya!"; // new String("merhaba dunya!") ile ayni isi yapan fakat hafiza acisindan daha efektif olan String nesnesi olusturma
        System.out.println(yazi4);

        String yazi5 = "merhaba dunya!";
        int yazininBuyuklugu = yazi5.length(); // .length() fonksiyonu yazinin uzunlugunu verir
        System.out.println(yazininBuyuklugu);

        String yazi6 = "Merhaba Dunya!";
        String yazininBuyukHali = yazi6.toUpperCase(); // .toUpperCase() yazinin karakterlerinin buyuk harfli halini sonuc olarak donduren fonksiyon
        System.out.println(yazininBuyukHali);


        String yazi7 = "Merhaba Dunya!";
        String yazininKucukHali = yazi7.toLowerCase(); // .toLowerCase() yazinin karakterlerinin kucuk harfli halini sonuc olarak donduren fonksiyon
        System.out.println(yazininKucukHali);


        String yazi8 = "merhaba ";
        String yazi9 = "merhaba";
        boolean esitMi = yazi8.equals(yazi9); // .equals(String nesne) iki String nesnesinin esitligini boolean deger olarak donduren fonksiyon
        System.out.println(esitMi);


        String yazi10 = "        Merhaba Dunya!            ";
        String yazi11 = "Merhaba Dunya!";
        String kirpilmisYazi = yazi10.trim(); // .trim() String nesnesinin basindaki ve sonundaki bosluk (space) karakterlerini kirpan fonksiyon
        System.out.println(yazi10.length());
        System.out.println(kirpilmisYazi.length());
        System.out.println(yazi10.trim().equals(yazi11));


        String yazi12 = "Merhaba Dunya!";
        int karakterIndexi = 7;
        char karakter = yazi12.charAt(karakterIndexi); // .charAt(int index) String nesnesinin parametre olarak verilen index'indeki karakteri donduren fonksiyon
        System.out.println(karakter);

        String yazi13 = "Merhaba Dunya!";
        int karakterIndexi2 = yazi13.indexOf('a'); // .indexOf(int char) String nesnesinin parametre olarak verilen karakterin nesnedeki indexini donduren fonksiyon
        System.out.println(karakterIndexi2);


        String yazi14 = "Merhaba Dunya!";
        String[] bolunmusYazi = yazi14.split("a"); // .split(String string) nesneyi parametre olarak verilen String'e gore ayiran ve sonucu bir String[] dizisinde donduren fonksiyon
        System.out.println("Dizinin boyutu: " + bolunmusYazi.length);
        System.out.println(bolunmusYazi[0]);
        System.out.println(bolunmusYazi[1]);
        System.out.println(bolunmusYazi[2]);
        System.out.println(bolunmusYazi[3]);


        String isimler = "Ali Emel Ebru";
        String[] isimDizisi = isimler.split(" ");

        System.out.println(isimDizisi[1]);
        System.out.println(isimDizisi[2]);
        System.out.println(isimDizisi[0]);


//        String.format() ornegi
        String isim = "Ezgi";
        int yas = 15;
        float boy = 1.4f;

        System.out.println(isim + " " + yas + " yasinda ve " + boy + " metre boyunda");
//        {ISIM} {YAS} yasinda ve {BOY} metre boyunda
        String formatlanmisYazi = String.format("%s %d yasinda ve %.2f metre boyunda", isim, yas, boy);
        System.out.println(formatlanmisYazi);


    }
}




















