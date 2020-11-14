/*
    Quiz PBO

    Barry Samuel S.
    2019071032

 */
package com.pbo;

import java.util.Scanner;

class Soal {
    Scanner userInput = new Scanner(System.in);
    Display displayFunc = new Display();
    double bil1, bil2, bil3;

    void inputRoutine() {
        displayFunc.Bar();
        System.out.print("Masukkan Bilangan 'A' = ");
        bil1 = userInput.nextDouble();
        System.out.print("Masukkan Bilangan 'B' = ");
        bil2 = userInput.nextDouble();
        System.out.print("Masukkan Bilangan 'C' = ");
        bil3 = userInput.nextDouble();
        displayFunc.Bar();
    }

    void displayRoutine(double getA, double getB, double getC) {
        System.out.println("Nilai A = " + getA );
        System.out.println("Nilai B = " + getB );
        System.out.println("Nilai C = " + getC );
        displayFunc.Bar();
    }

    void pauseRoutine() {
        System.out.println("Tekan Enter untuk melanjutkan program...");
        try {
            System.in.read();
        } catch(Exception e)
        {}
    }

    void Nomor1() {
        SoalSatu objSatu = new SoalSatu();
        inputRoutine();
        objSatu.setNilai(bil1, bil2, bil3);
        displayRoutine(objSatu.getBilA(), objSatu.getBilB(), objSatu.getBilC());
        System.out.println("Hasil Penjumlahan = " + objSatu.getNilaiJumlah());
        pauseRoutine();
    }

    void Nomor2() {
        SoalDua objDua = new SoalDua();
        inputRoutine();
        objDua.setNilai(bil1, bil2, bil3);
        displayRoutine(objDua.getBilA(), objDua.getBilB(), objDua.getBilC());
        System.out.println("Hasil Penjumlahan = " + objDua.getNilaiJumlah());
        System.out.println("Hasil Rata-Rata (Mean) = " + objDua.getNilaiMean());
        pauseRoutine();
    }
    
    void Nomor3() {
        SoalTiga objTiga = new SoalTiga();
        inputRoutine();
        objTiga.setNilai(bil1, bil2, bil3);
        displayRoutine(objTiga.getBilA(), objTiga.getBilB(), objTiga.getBilC());
        System.out.println("Nilai Maximum = " + objTiga.getBilMax());
        System.out.println("Nilai Minimum = " + objTiga.getBilMin());
        pauseRoutine();
    }

    void Nomor4() {
        SoalEmpat objEmpat = new SoalEmpat();
        objEmpat.main();
    }
}


class Display {
    void Bar() {
        for (int dispLength = 0; dispLength < 32; dispLength++)
            System.out.print("=");
        System.out.print("\n");
    }
    String MenuBar() {
        String bar = "";
        for (int dispLength = 0; dispLength < 32; dispLength++) {
            bar = bar + "=";
            if (dispLength == 31)
                bar = bar + "\n";
        }
        return bar;
    }
}

class Menu {
    Scanner userInput = new Scanner(System.in);
    Display displayFunc = new Display();
    Soal soal = new Soal();
    int Selection = 0;
    void Select() {
        while (Selection != 5) {
            System.out.print(displayFunc.MenuBar() +
                    "SOAL QUIZ PBO\n" + displayFunc.MenuBar() +
                    "Menu: \n" + displayFunc.MenuBar() +
                    "1. Soal Nomor 1 \n" +
                    "2. Soal Nomor 2 \n" +
                    "3. Soal Nomor 3 \n" +
                    "4. Soal Nomor 4 \n" +
                    "5. Exit \n" + displayFunc.MenuBar() +
                    "Masukkan pilihan anda [1 - 5]: ");
            Selection = userInput.nextInt();
            switch (Selection) {
                case 1:
                    soal.Nomor1();
                    break;
                case 2:
                    soal.Nomor2();
                    break;
                case 3:
                    soal.Nomor3();
                    break;
                case 4:
                    soal.Nomor4();
                    break;
                case 5:
                    System.out.println("Program Berhenti!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan yang anda masukkan salah!");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Menu Menu = new Menu();
        Menu.Select();
    }
}
