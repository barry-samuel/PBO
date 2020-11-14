package com.pbo;

public class PaketInternet extends BoilerWarnet {
    protected double harga, waktuInternet, hargaInternet;

    public PaketInternet() {
        super();
        this.waktuInternet = 0;
        this.harga = 4000;
    }

    void hitungHargaInternet() {
        hargaInternet = (waktuInternet / jam) * harga;
    }

    public double getWaktuInternet() {
        return waktuInternet;
    }

    public void setWaktuInternet(double waktuInternet) {
        this.waktuInternet = waktuInternet;
    }

    double getHargaInternet() {
        hitungHargaInternet();
        return hargaInternet;
    }
}
