package com.pbo;

public class PaketGame extends BoilerWarnet {
    protected double harga, waktuGame, hargaGame;

    public PaketGame() {
        super();
        this.waktuGame = 0;
        this.harga = 5000;
    }

    void hitungHargaGame() {
        hargaGame = (waktuGame / jam) * harga;
    }

    public double getWaktuGame() {
        return waktuGame;
    }

    public void setWaktuGame(double waktuGame) {
        this.waktuGame = waktuGame;
    }

    double getHargaGame() {
        hitungHargaGame();
        return hargaGame;
    }
}
