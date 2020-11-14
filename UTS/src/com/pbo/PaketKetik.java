package com.pbo;

public class PaketKetik extends BoilerWarnet{
    protected double harga, waktuKetik, hargaKetik;

    public PaketKetik() {
        super();
        this.waktuKetik = 0;
        this.harga = 2000;
    }

    void hitungHargaKetik() {
        hargaKetik = (waktuKetik / jam) * harga;
    }

    public double getWaktuKetik() {
        return waktuKetik;
    }

    public void setWaktuKetik(double waktuKetik) {
        this.waktuKetik = waktuKetik;
    }

    double getHargaKetik() {
        hitungHargaKetik();
        return hargaKetik;
    }
}
