package com.pbo;

import java.util.Scanner;

class Penjumlahan {
    protected int BIL_COUNT;
    protected double RESULT;
    protected double[] BIL_ARR = new double[11];
    Scanner userInput = new Scanner(System.in);

    void _USER_INPUT_ROUTINE() {
        for (BIL_COUNT = 0; BIL_COUNT <= 9; BIL_COUNT++) {
            System.out.print("Masukkan Bilangan Ke-" + (BIL_COUNT + 1) + " = ");
            BIL_ARR[BIL_COUNT] = userInput.nextDouble();
        }
    }

    double _SUM_BIL() {
        for (; BIL_COUNT >= 0; BIL_COUNT--)
            RESULT = RESULT + BIL_ARR[BIL_COUNT];
        return this.RESULT;
    }

}

class Display {
    void DISP_BAR() {
        System.out.println("==============================");
    }
}

public class NomorTigaPenjumlahan {
    public static void main(String[] args) {
        Display disp = new Display();
        Penjumlahan jumlah = new Penjumlahan();

        disp.DISP_BAR();
        System.out.println("Penjumlahan Bilangan");
        disp.DISP_BAR();
        jumlah._USER_INPUT_ROUTINE();
        disp.DISP_BAR();
        System.out.println("Hasil Penjumlahan = " + jumlah._SUM_BIL());
        disp.DISP_BAR();
    }
}
