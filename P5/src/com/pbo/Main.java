package com.pbo;

public class Main {
    public static void main(String[] args) {
        Classku objku = new Classku();
        System.out.println(objku.x);
        System.out.println(objku.y);
        System.out.println(objku.tampilkanZ());

        Bilangan obil = new Bilangan();
        System.out.println("Nilai A = "  + obil.tampilkanA());
        System.out.println("Nilai B = "  + obil.tampilkanB());
        System.out.println("Nilai C = "  + obil.tampilkanC());

        // Nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkanA());
        // Nilai B diinput
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkanB());
        // Nilai C diinput
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkanC());

        // Panggil method tambah()
        System.out.println("Hasil Pertambahan = " + obil.tambah());
        // Panggil method kurang()
        System.out.println("Hasil Pengurangan = " + obil.kurang());
        // Panggil method kali()
        System.out.println("Hasil Perkalian = " + obil.kali());
        // Panggil method bagi()
        System.out.println("Hasil Pembagian = " + obil.bagi());

        // Panggil method inputData(int a, int b, int c)
        obil.inputData(3, 5, 2);
        System.out.println("Hasil Pertambahan = " +obil.tambah());
    }
}