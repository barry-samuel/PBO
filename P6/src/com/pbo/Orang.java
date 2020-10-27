package com.pbo;

public class Orang {
    String nama;

    Orang() {
        this.nama = "";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}

class Karyawan extends Orang {
    String NIP;
    int golongan;
    int jamKerja;
    double totalGaji;
    double totalBersih;
    double gajiPokok;
    double gajiTunjangan;
    double gajiLembur;
    double pajak;

    Karyawan() {
        this.NIP = "";
        this.golongan = 0;
        this.jamKerja = 0;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    void setGolongan() {
        switch (getGolongan()) {
            case 1 -> {
                this.gajiPokok = 1486500;
                this.gajiTunjangan = 250000;
            }
            case 2 -> {
                this.gajiPokok = 1926000;
                this.gajiTunjangan = 300000;
            }
            case 3 -> {
                this.gajiPokok = 2456700;
                this.gajiTunjangan = 350000;
            }
            case 4 -> {
                this.gajiPokok = 2899500;
                this.gajiTunjangan = 400000;
            }
            default -> {
                System.out.println("Error! golongan yang dimasukkan tidak ada");
                System.exit(0);
            }
        }
    }

    void setLembur() {
        if (getJamKerja() > 173) {
            int jamLembur = getJamKerja() - 173;
            this.gajiLembur = jamLembur * 20000;
        }
    }

    void setTotal() {
        this.totalGaji = gajiPokok + gajiTunjangan + gajiLembur;
    }

    void setTotalBersih() {
        double gajiUtama = gajiPokok + gajiTunjangan;
        this.pajak = (gajiUtama) * (0.5 / 100);
        this.totalBersih = (gajiUtama + gajiLembur) - pajak;
    }

    void routine() {
        setGolongan();
        setLembur();
        setTotal();
        setTotalBersih();
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public double getTotalBersih() {
        return totalBersih;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getGajiTunjangan() {
        return gajiTunjangan;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getPajak() {
        return pajak;
    }
}