package com.pboreg;

public class Segitiga {
    /**
     * Program Menghitung Luas Segitiga
     * alas dan tinggi diinput melalui kode program
     * tampilan output:
     * Program Segitiga
     * alas = 10
     * tinggi = 20
     * Luas = 100
     */
    public static void main(String[] args) {
        int ALAS, TINGGI;
        double luas;

        System.out.println("Program Luas Segitiga");
        ALAS = 10;
        TINGGI = 20;
        luas = 0.5 * ALAS * TINGGI;
        System.out.println("Alas = " + ALAS);
        System.out.println("Tinggi = " + TINGGI);
        System.out.println("Luas = 1/2 x " + ALAS + " x " + TINGGI + " = " + luas);
    }
}
