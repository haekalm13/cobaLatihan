package com.tkhaekal;

public class CobaX {


    public static void main(String[] args) {
        CobaZ cobaZ = new CobaZ();
        CobaP cobaP = cobaZ.getCobaP(5);
        CobaP cobax = cobaP;
        CobaP cobazz = cobax;
        CobaP cobaM = cobazz;
        System.out.println("Reference cobaP -> "+cobaP);
        System.out.println("Reference cobaX -> "+cobax);
        System.out.println("Reference cobazz -> "+cobazz);
        System.out.println("Reference cobaM -> "+cobaM);

        System.out.println(cobaP.getIntX());//5
        System.out.println(cobax.getIntX());//5
        System.out.println(cobazz.getIntX());//5
        System.out.println(cobaM.getIntX());//5

        cobax.setIntX(7);
        System.out.println("Reference cobaP -> "+cobaP);
        System.out.println("Reference cobaX -> "+cobax);
        System.out.println(cobaP.getIntX());//7
        System.out.println(cobax.getIntX());//5
        System.out.println(cobazz.getIntX());//5
        System.out.println(cobaM.getIntX());//5
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