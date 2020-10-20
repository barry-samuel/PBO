package com.pbo;

class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // Constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // Method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tapi tidak ada parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // Method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class p5Methods {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "13374456");

        // Method
        mahasiswa1.show();
        mahasiswa1.setNama("Tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Halo");
        System.out.println(data);
    }
}
