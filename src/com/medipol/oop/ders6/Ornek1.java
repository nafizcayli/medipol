package com.medipol.oop.ders6;/*

Kullanici ‘x’ karakterini girene kadar kullanicidan pespese girdiler alan ve bu girdileri bir dosyaya kaydeden bir program yaziniz.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dosyaIsmi = "ornek1.txt";
        File dosya = new File(dosyaIsmi);

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(dosya);
            while (true) {
                String girdi = scanner.nextLine();
                if (girdi.equals("x")) {
                    break;
                } else {
                    printWriter.println(girdi);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
