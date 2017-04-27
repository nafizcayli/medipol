package com.medipol.oop.ders9.orn3;

/*
         A
       |  |
       B  C

 */

public class Test {
    public static void main(String[] args) {

        A aNesnesi = new A();
        aNesnesi.methodA();

        B bNesnesi = new B();
        bNesnesi.methodA();
        bNesnesi.methodB();

        C cNesnesi = new C();
        cNesnesi.methodA();
        cNesnesi.methodC();

    }
}
