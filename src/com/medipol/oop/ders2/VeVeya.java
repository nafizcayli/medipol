package com.medipol.oop.ders2;

public class VeVeya {
    public static void main(String[] args) {
//        && (Ve)
//        || (Veya)

        int a = 20;
        int b = 10;
        int c = 5;

        System.out.println(a > b && b > c);
        System.out.println(a > b && b < c);


        System.out.println(a > b || b < c);
        System.out.println(a < b || b < c);

        System.out.println((a > b || b < c) && (b > c || a < b));
    }
}
