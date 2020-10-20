package com.pbo;

// Class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// Class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // Constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class p5Constructor {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup","123124124","Teknik Kehutanan");
        Mahasiswa mahasiswa2 = new Mahasiswa("Otong","123124221","Teknik Pertambangan");

        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
    }
}
