package com.pbo;

public class SoalSatu {
    protected double bilA, bilB, bilC, bilJumlah;

    public SoalSatu() {
        this.bilA = this.bilB = this.bilC = 0;
    }

    private void OperasiPenjumlahan() {
        bilJumlah = bilA + bilB + bilC;
    }

    public void setNilai(double bil1, double bil2, double bil3) {
        this.bilA = bil1;
        this.bilB = bil2;
        this.bilC = bil3;
    }

    public double getBilA() {
        return bilA;
    }

    public double getBilB() {
        return bilB;
    }

    public double getBilC() {
        return bilC;
    }

    public double getNilaiJumlah() {
        OperasiPenjumlahan();
        return bilJumlah;
    }
}
