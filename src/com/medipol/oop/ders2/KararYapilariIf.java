package com.medipol.oop.ders2;

public class KararYapilariIf {
    public static void main(String[] args) {
        int sicaklik = 28;


//        if (kosul) {
//            //kosul true/dogru ise calistirilacak kod bloku
//        }
        if (sicaklik > 25) {
            System.out.println("Bugun hava sicak");
        }


//        if (kosul) {
//            kosul true / dogru ise calistirilacak kod bloku
//        } else {
//            kosul false / yanlis ise calistirilacak kod bloku
//        }

        if (sicaklik > 25) {
            System.out.println("Bugun hava sicak");
        } else {
            System.out.println("Bugun hava sicak degil");
        }


//        if (kosul1) {
//            kosul1 true/dogru ise calistirilacak kod bloku
//        } else if (kosul2) {
//            kosul2 true/dogru ise calistirilacak kod bloku
//        } else if (kosul3) {
//            kosul3 true/dogru ise calistirilacak kod bloku
//        } else {
//            butun kosullar false/yanlis ise calistirilacak kod bloku
//        }

        if (sicaklik < 0) {
            System.out.println("Bugun hava cok soguk");
        } else if (sicaklik < 10) {
            System.out.println("Bugun hava soguk");
        } else if (sicaklik < 15) {
            System.out.println("hava normal sicaklikta");
        } else if (sicaklik < 25) {
            System.out.println("Hava sicak");
        } else {
            System.out.println("Hava cok sicak");
        }

        System.out.println("Program bitti");


    }
}
