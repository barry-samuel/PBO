package com.pbo;

abstract class HitungLuasV2 {
    protected double s1;
    protected double s2;

    public HitungLuasV2() {
        this.s1 = 0;
        this.s2 = 0;
    }

    public HitungLuasV2(double s1) {
        this.s1 = s1;
    }

    public HitungLuasV2(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public abstract double  getLuas();

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
}

class SegitigaV2 extends HitungLuasV2 {
    public SegitigaV2(double s1, double s2) {
        super(s1, s2);
    }

    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}

class LingkaranV2 extends HitungLuasV2 {
    public LingkaranV2(double s1) {
        super(s1);
    }

    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class P8RunLuasV2 {
    public static void main(String[] args) {
        SegitigaV2 oSegitiga = new SegitigaV2(5, 2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegitiga.getS1() + " x " +
                oSegitiga.getS2() + " = " +
                oSegitiga.getLuas());

        LingkaranV2 oLingkaran = new LingkaranV2(10);
        System.out.println("Luas Lingkaran = " + oLingkaran.getLuas());
    }
}
