package com.medipol.oop.ders1;

public class KarsilastirmaOperatorleri {

    public static void main(String[] args) {
//        < (Küçüktür)
//        > (Büyüktür)
//        <= (Küçük Eşittir)
//        >= (Büyük Eşittir)
//        == (Eşittir)
//        != (Eşit Değildir)

        int a = 10;
        int b = 20;

        System.out.println(a < b);
        System.out.println(a > b);

        int c = 25;
        int d = 12;
        System.out.println(c <= d);

        d = 25;

        System.out.println(c >= d);
        System.out.println(25 >= 25);

        float e = 34.5f;
        float f = 12.34f;

        System.out.println(e == f);
        System.out.println(e != f);


    }

}
