package com.pbo;

import java.util.Scanner;

abstract class boilerPlate {
    Scanner userInput = new Scanner(System.in);
    public abstract double getLuas();
    public abstract void setLuas();
    public abstract void displayLuas();
}

class Segitiga extends boilerPlate {
    protected double LUAS, ALAS, TINGGI;

    @Override
    public double getLuas() {
        LUAS = ((double) 1/2) * ALAS * TINGGI;
        return LUAS;
    }

    @Override
    public void setLuas() {
        System.out.println("Hitung Luas Segitiga:");
        System.out.print("Alas = ");
        ALAS = userInput.nextDouble();
        System.out.print("Tinggi = ");
        TINGGI = userInput.nextDouble();
    }

    @Override
    public void displayLuas() {
        setLuas();
        System.out.println("Luas Segitiga adalah 1/2 * " + ALAS  + " * " + TINGGI + " = " + getLuas() + " cm^2");
    }
}

class Lingkaran extends boilerPlate {
    protected double LUAS, JARI, DIAMETER, PI;

    @Override
    public double getLuas() {
        LUAS = (3.14) * JARI * JARI;
        return LUAS;
    }

    @Override
    public void setLuas() {
        System.out.println("Hitung Luas Lingkaran:");
        System.out.print("Diameter = ");
        DIAMETER = userInput.nextDouble();

        if ((DIAMETER % 7) == 0) {
            PI = (22/7d);
        } else {
            PI = (3.14);
        }
        JARI = DIAMETER / 2;
    }

    @Override
    public void displayLuas() {
        setLuas();
        System.out.println("Luas Lingkaran adalah \u03C0 * " + JARI  + " * " + JARI + " = " + getLuas() + " cm^2");
    }
}

class Display {
    public void Bar() {
        System.out.println("==============================");
    }
}


public class P8PerhitunganLuas {
    public static void main(String[] args) {
        Display disp = new Display();
        Scanner selector = new Scanner(System.in);
        int menuState = -1;
        while (menuState != 0) {
            disp.Bar();
            System.out.println("PROGRAM HITUNG LUAS");
            disp.Bar();
            System.out.println("1. Luas Segitiga\n2. Luas Lingkaran\n0. Keluar Program");
            disp.Bar();
            System.out.print("Piliahan : ");
            menuState = selector.nextInt();
            disp.Bar();
                switch (menuState) {
                    case 1:
                        Segitiga segitiga = new Segitiga();
                        segitiga.displayLuas();
                        break;
                    case 2:
                        Lingkaran lingkaran = new Lingkaran();
                        lingkaran.displayLuas();
                        break;
                    case 0:
                        System.out.println("Program Berhenti!");
                        break;
                    default:
                        System.out.println("Piliahan yang anda masukkan salah!");
                }

            }
        }
}
