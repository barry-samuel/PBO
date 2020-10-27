package com.pbo;

import java.util.Scanner;

class Orang {
    private String _nama;
    private int _umur;
    private String _golDarah;

    // Constructor
    public Orang() {
        this._nama = "blank";
        this._umur = 0;
    }

    // Method
    public void setNama(String nama) {
        this._nama = nama;
    }

    public void setUmur(int umur) {
        this._umur = umur;
    }

    public void setGolDarah(String golDarah) {
        this._golDarah = golDarah;
    }

    public String getNama() {
        return this._nama;
    }

    public int getUmur() {
        return this._umur;
    }

    public String getGolDarah() {
        return this._golDarah;
    }
}

class Pegawai extends Orang {
    private String _NIP;
    private String _jabatan;

    public Pegawai() {
        this._NIP = "";
        this._jabatan = "";
    }

    public String getNIP() {
        return _NIP;
    }

    public void setNIP(String _NIP) {
        this._NIP = _NIP;
    }

    public String getJabatan() {
        return _jabatan;
    }

    public void setJabatan(String _jabatan) {
        this._jabatan = _jabatan;
    }
}

public class p6Orang {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String nama;
        int umur;

        Orang Orang0 = new Orang();
        Orang Orang1 = new Orang();
        Pegawai Pegawai0 = new Pegawai();

        System.out.printf("Masukkan Nama = ");
        nama = userInput.nextLine();
        System.out.printf("Masukkan Umur = ");
        umur = userInput.nextInt();

        Orang0.setNama(nama);
        Orang0.setUmur(umur);
        System.out.println("Nama: " + Orang0.getNama());
        System.out.println("Umur: " + Orang0.getUmur());

        Orang1.setNama("Ucup");
        Orang1.setUmur(17);
        System.out.println("Nama: " + Orang1.getNama());
        System.out.println("Umur: " + Orang1.getUmur());

        Pegawai0.setNama("Otong");
        Pegawai0.setUmur(24);
        Pegawai0.setNIP("133713371337");
        Pegawai0.setJabatan("Engineer");

        System.out.println("Nama: " + Pegawai0.getNama());
        System.out.println("Jabatan: " + Pegawai0.getJabatan());
        System.out.println("Umur: " + Pegawai0.getUmur());
        System.out.println("NIP: " + Pegawai0.getNIP());
    }
}
