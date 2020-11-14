package com.pbo;

public class PaketScan {
    protected double harga, hargaScan;

    public PaketScan() {
        super();
        harga = 1000;
        hargaScan = 0;
    }

    void hitungHargaScan(int banyakScan) {
        hargaScan = banyakScan * harga;
    }

    public double getHargaScan() {
        return hargaScan;
    }
}
