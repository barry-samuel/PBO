package com.pbo;

public class BoilerWarnet {
    protected double jam, jumlahWaktu, jumlahTotal, waktuKetik, waktukInternet, waktuGame;
    protected double hargaKetik, hargaInternet, hargaGame, hargaScan, hargaPrint, hargaTeh;
    protected int banyakPrintHP, banyakPrintWarna, banyakTeh;

    public BoilerWarnet() {
        jam = 60;
        jumlahTotal = 0;
        jumlahWaktu = 0;
        waktuKetik = 0;
        waktukInternet = 0;
        waktuGame = 0;
        hargaKetik = 0;
        hargaInternet = 0;
        hargaGame = 0;
        hargaScan = 0;
        hargaPrint = 0;
        hargaTeh = 0;
        banyakPrintHP = 0;
        banyakPrintWarna = 0;
        banyakTeh = 0;
    }

    public double getJumlahWaktu() {
        return jumlahWaktu;
    }

    public double getJumlahTotal() {
        return jumlahTotal;
    }

    public double getHargaScan() {
        return hargaScan;
    }

    public double getHargaPrint() {
        return hargaPrint;
    }

    public double getHargaTeh() {
        return hargaTeh;
    }

    public void setJumlahWaktu(double jumlahWaktu) {
        this.jumlahWaktu = jumlahWaktu;
    }

    public void setJumlahTotal(double jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }
}
