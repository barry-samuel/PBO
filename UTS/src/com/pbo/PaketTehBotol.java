package com.pbo;

public class PaketTehBotol {
    protected double harga, hargaTehBotol;

    public PaketTehBotol() {
        super();
        harga = 3000;
        hargaTehBotol = 0;
    }

    void hitungHargaTehBotol(int banyakTehBotol) {
        hargaTehBotol = banyakTehBotol * harga;
    }

    public double getHargaTehBotol() {
        return hargaTehBotol;
    }
}
