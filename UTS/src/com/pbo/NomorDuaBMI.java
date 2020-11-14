package com.pbo;

import java.util.Scanner;

class BMI {
    double BERAT_BADAN, TINGGI_BADAN, RESULT;
    String STATUS;

    public BMI(double berat, double tinggi) {
        this.BERAT_BADAN = berat;
        this.TINGGI_BADAN = tinggi;
    }

    double _KalkulatorBMI() {
        this.RESULT = BERAT_BADAN / (TINGGI_BADAN * TINGGI_BADAN);
        return this.RESULT;
    }

    String _StatusBMI() {
        _KalkulatorBMI();
        if (RESULT >= 18.5 && RESULT <= 22.9) {
            this.STATUS = "IDEAL/NORMAL";
        }
        else if (RESULT < 18.5) {
            this.STATUS = "UNDERWEIGHT";
        }
        else if (RESULT > 22.9) {
            this.STATUS = "OVERWEIGHT";
        }
        else {
            this.STATUS = null;
        }
        return this.STATUS;
    }
}

public class NomorDuaBMI {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Kalkulator BMI");
        System.out.println("========================");

        System.out.print("Berat Badan (kg) = ");
        double berat = userInput.nextDouble();
        System.out.print("Tinggi Badan (m) = ");
        double tinggi = userInput.nextDouble();
        if (tinggi > 10) {
            tinggi = tinggi / 100;
        }
        System.out.println("========================");

        BMI hitungBMI = new BMI(berat, tinggi);
        System.out.println("BMI = " + hitungBMI._KalkulatorBMI());
        System.out.println("Status BMI = " + hitungBMI._StatusBMI());

        System.out.println("========================");
    }
}
