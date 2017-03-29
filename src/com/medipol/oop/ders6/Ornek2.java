package com.medipol.oop.ders6;/*

Kullanicidan girdi alarak bu girdileri bir ArrayList icerisinde tutan alisveris listesi programi yaziniz.
Kullanici girdi olarak ‘x’ girerse bu zamana kadar listeye ekledigi her elemani ekrana yazdirip programi sonlandiriniz.

  */

import java.util.ArrayList;
import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<String>();

        while (true) {
            String girdi = scanner.nextLine();
            if (girdi.equals("x")) {
                break;
            } else {
                liste.add(girdi);
            }
        }

        for (String s : liste) {
            System.out.println(s);
        }

    }
}














