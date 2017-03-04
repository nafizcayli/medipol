package com.medipol.oop.ders2;

public class Donguler {
    public static void main(String[] args) {

//        while (kosul) {
//            kosul true/dogru oldugu surece calistirilacak kod bloku
//        }

        int sayi1 = 0;
        while (sayi1 <= 25) {
            sayi1 = sayi1 + 5;
            System.out.println(sayi1);
        }

//        do {
//            kosula bakmaksizin bir defa calistirilan, daha sonra kosul true/dogru oldugu surece calistirilacak kod bloku
//        } while (kosul);

        int sayi2 = 0;
        do {
            sayi2 = sayi2 + 5;
            System.out.println(sayi2);
        } while (sayi2 <= 25);


//        for (degiskenTanimi; kosul; degiskeninDegisimMiktari) {
//            kosul dogru oldugu surece calistirilacak kod
//        }

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 50; i <= 100; i += 5) {
            System.out.println(i);
        }


        for (int i = 500; i > 100; i -= 5) {
            System.out.println(i);
        }

    }
}
