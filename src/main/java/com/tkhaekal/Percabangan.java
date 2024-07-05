package com.tkhaekal;

public class Percabangan {
    public static void main(String[] args) {
        double gaji = 5000000.0;
        String strStatusRumah = "Tetap";
        int jumlahTanggungan = 0;
        int intX = 0;
        int intNum=3;
        if(gaji>3000000){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }else if(strStatusRumah.equals("Tetap")) {
            System.out.println("Ini Else");
        }else if(jumlahTanggungan==0) {
            System.out.println("Ini Else");
        }

        int x = 20;
        if(x%2 == 0 ){
            if(x/100 !=0){
                System.out.println(x+" Genap lebih dari seratus");
            }
        } else {
            if (x / 10 != 0) {
                System.out.println(x + " Genap Lebih dari sepuluh");
            }
        }

        String strHari = "Senin";
        switch (strHari){
            case "Senin":
                System.out.println("Ini Hari Senin");break;
            case "Selasa":
                System.out.println("Ini Hari Selasa");break;
            case "Rabu":
                System.out.println("Ini Hari Rabu");break;
            case "Kamis":
                System.out.println("Ini Hari Kamis");break;
            default:
                System.out.println("Ini Hari Weekend");break;

        }

        for (int i = 1; i < 5; i++) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
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


