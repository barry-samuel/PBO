package com.pbo;

public class PaketPrint extends BoilerWarnet {
    protected double hargaHP, hargaWarna, hargaPrintHP, hargaPrintWarna;

    public PaketPrint() {
        super();
        hargaHP = 300;
        hargaWarna = 500;
    }

    void hitungPrintHP(int banyakPrintHP) {
        hargaPrintHP = banyakPrintHP * hargaHP;
    }

    void hitungPrintWarna(int banyakPrintWarna) {
        hargaPrintWarna = banyakPrintWarna * hargaWarna;
    }

    public double getHargaPrintWarna() {
        return hargaPrintWarna;
    }

    public double getHargaPrintHP() {
        return hargaPrintHP;
    }
}
