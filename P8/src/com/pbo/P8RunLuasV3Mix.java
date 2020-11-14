package com.pbo;

abstract class HitungLuasV3Mix {
    protected double s1;
    protected double s2;

    public HitungLuasV3Mix() {
        this.s1 = 0;
        this.s2 = 0;
    }

    public void setSisi(double s1) {
        this.s1 = s1;
    }

    public void setSisi(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
}

interface interfaceHitungLuasV3Mix {
    double getLuas();
}

class SegitigaV3Mix extends HitungLuasV3Mix implements interfaceHitungLuasV3Mix {
    @Override
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}

class LingkaranV3Mix extends HitungLuasV3Mix implements interfaceHitungLuasV3Mix {
    @Override
    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class P8RunLuasV3Mix {
    public static void main(String[] args) {
        SegitigaV3Mix oSegitiga = new SegitigaV3Mix();
        oSegitiga.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegitiga.getS1() + " x " +
                oSegitiga.getS2() + " = " +
                oSegitiga.getLuas());

        LingkaranV3Mix oLingkaran = new LingkaranV3Mix();
        oLingkaran.setSisi(10);
        System.out.println("Luas Lingkaran = " + oLingkaran.getLuas());
    }
}
