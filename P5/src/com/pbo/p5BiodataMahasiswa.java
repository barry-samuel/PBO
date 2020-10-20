package com.pbo;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    int angkatan;

    Mahasiswa(String nama, String NIM, String jurusan, int angkatan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

   void display() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("Angkatan : " + this.angkatan);
    }


}

class dispInfo {
    void dispBar() {
        System.out.println("=================================");
    }

    void openBanner() {
        System.out.println("BIODATA MAHASISWA");
    }

    void closeBanner() {
        System.out.println("PROGRAM SELESAI!");
    }
}

class run {
    void inputData() {
        dispInfo disp = new dispInfo();

        Scanner userInput = new Scanner(System.in);

        disp.dispBar();
        System.out.print("Nama = ");
        String nama = userInput.nextLine();

        System.out.print("NIM = ");
        String NIM = userInput.nextLine();

        System.out.print("Jurusan = ");
        String jurusan = userInput.nextLine();

        System.out.print("Angkatan = ");
        int angkatan = userInput.nextInt();
        disp.dispBar();

        Mahasiswa dataMahasiwa = new Mahasiswa(nama, NIM, jurusan, angkatan);
        dataMahasiwa.display();
        disp.dispBar();
    }
}

public class p5BiodataMahasiswa {
    public static void main(String[] args) {
        // Biodata Mahasiswa (Nama, NIM, Jurusan, Angkatan)
        // 1. Input
        // 2. Display

        dispInfo disp = new dispInfo();
        run run = new run();
        disp.openBanner();
        run.inputData();
        disp.closeBanner();

    }
}
