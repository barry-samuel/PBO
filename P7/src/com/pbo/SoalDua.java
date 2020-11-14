package com.pbo;

public class SoalDua extends SoalSatu {
    protected double bilMean;
    public SoalDua() {
        super();
    }

    private void OperasiMean() {
        bilMean = (bilA  + bilB + bilC) / 3;
    }

    public double getNilaiMean() {
        OperasiMean();
        return bilMean;
    }
}
