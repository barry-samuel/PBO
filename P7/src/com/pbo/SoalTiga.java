package com.pbo;

import java.util.Arrays;

public class SoalTiga extends SoalSatu{
    protected double bilMax, bilMin;

    public SoalTiga() {
        super();
    }

    private void OperasiMax() {
        double[] arr = {getBilA(), getBilB(), getBilC()};
        double tmp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        bilMax = arr[2];
        //System.out.println("DEBUG ARR =" + Arrays.toString(arr));
    }

    private void OperasiMin() {
        double[] arr = {getBilA(), getBilB(), getBilC()};
        double tmp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        bilMin = arr[2];
        //System.out.println("DEBUG ARR =" + Arrays.toString(arr));
    }

    public double getBilMax() {
        OperasiMax();
        return bilMax;
    }

    public double getBilMin() {
        OperasiMin();
        return bilMin;
    }
}
