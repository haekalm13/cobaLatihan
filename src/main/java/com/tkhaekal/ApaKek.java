package com.tkhaekal;

public class ApaKek {

    public static void main(String[] args) {
        Cobaan cobaan = new Cobaan();//10
        System.out.println("nilai cobaan saat ini "+cobaan);

        Cobaan cobaan1 = cobaan;//10
        System.out.println("nilai cobaan1 saat ini "+cobaan1);

        cobaan = new Cobaan();//40
        System.out.println("nilai cobaan saat ini "+cobaan);//40
        System.out.println("nilai cobaan1 saat ini "+cobaan1);//10
        /*
        nilai cobaan saat ini Cobaan@f6f4d33
nilai cobaan1 saat ini Cobaan@f6f4d33
nilai cobaan saat ini Cobaan@f6f4d33
nilai cobaan1 saat ini Cobaan@23fc625e
         */
        int a = 25;

        if(a < 25) {

            System.out.println("1");

        } else if(a > 10) {

            System.out.println("2");

        } else {

            System.out.println("3");

        }

    }
}
/*
IntelliJ IDEA 2024.1.4 (Community Edition)
Build #IC-241.18034.62, built on June 21, 2024
@Author ACER E5-475G Muhammad Haekal
Java Developer
Created on 03/07/2024 19:38
@Last Modified 03/07/2024 19:38
Version 1.0
*/
