/*
    Tugas - Aplikasi Penghitung Gaji

    Barry Samuel S.
    2019071032

    ----------------------------------------------------------------
    GOLONGAN 1 - GAJI POKOK Rp 1.486.500 -TUNJANGAN Rp 250.000
    GOLONGAN 2 - GAJI POKOK Rp 1.926.000 -TUNJANGAN Rp 300.000
    GOLONGAN 3 - GAJI POKOK Rp 2.456.700 -TUNJANGAN Rp 350.000
    GOLONGAN 4 - GAJI POKOK Rp 2.899.500 -TUNJANGAN Rp 400.000
    ----------------------------------------------------------------
    Jumlah jam kerja normal per bulan = 173 jam
    Jam lembur = jam kerja - 173 jam
    Jam lembur dibayar Rp 20.000/jam
    Pajak gaji pokok dan tunjangan pengabdian = 0.5%
    ----------------------------------------------------------------
    Dependency = Orang.java, java.util.Scanner (Java Util. Library)
    Variable = Nama, NIP, Golongan, Jam Kerja
    ----------------------------------------------------------------
 */

package com.pbo;

import java.util.Scanner;

class Display {
    void dBar(){
        for (int loop = 0; loop < 32; loop++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }
}

class personInfo {
    Scanner userInput = new Scanner(System.in);
    Karyawan pegawai = new Karyawan();

    void userNama() {
        System.out.print("Nama = ");
        String nama = userInput.nextLine();
        pegawai.setNama(nama);
    }
    void userNIP() {
        System.out.print("NIP = ");
        String NIP = userInput.nextLine();
        pegawai.setNIP(NIP);
    }
    void userGol() {
        System.out.print("Golongan = ");
        int gol = userInput.nextInt();
        pegawai.setGolongan(gol);
    }
    void userJam() {
        System.out.print("Jam Kerja = ");
        int jamKerja = userInput.nextInt();
        pegawai.setJamKerja(jamKerja);
    }

    void runtime(){
        userNama();
        userNIP();
        userGol();
        userJam();
        pegawai.routine();
    }

    void dispGaji() {
        System.out.println("Gaji Pokok = Rp. " + pegawai.getGajiPokok());
        System.out.println("Gaji Tunjangan = Rp. " + pegawai.getGajiTunjangan());
        System.out.print("Gaji Lembur = Rp. " + pegawai.getGajiLembur());
        if (pegawai.getGajiLembur() == 0) {
            System.out.println(" (Tidak ada)");
        } else {
            System.out.print("\n");
        }
        System.out.println("Gaji Total = Rp. " + pegawai.getTotalGaji());
        System.out.println("Pajak = Rp. " + pegawai.getPajak());
        System.out.println("Gaji Bersih = Rp. " + pegawai.getTotalBersih() + " setalah pajak 0.5%");
    }
}

public class Main {
    public static void main(String[] args) {
        Display disp = new Display();
        personInfo userRun = new personInfo();
        disp.dBar();
        userRun.runtime();
        disp.dBar();
        userRun.dispGaji();
        disp.dBar();
    }
}
