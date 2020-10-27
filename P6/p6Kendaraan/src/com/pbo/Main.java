package com.pbo;

public class Main {
    public static void main(String[] args) {
        Kendaraan Kendaraan0 = new Kendaraan("Toyota");
        System.out.println("Nama Kendaraan = " + Kendaraan0.getMerek());
        Mobil Mobil0 = new Mobil("Toyota", "Supra");
        Mobil0.viewData();
    }
}
