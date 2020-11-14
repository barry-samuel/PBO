package com.pbo;

// class Abstract
abstract class Hewan {
    // Abstract Method (tidak memiliki body)
    public abstract void suaraHewan();

    // Regular Method
    public void tidur() {
        System.out.println("Zzz...");
    }
}

//Subclass (turunan dari Class Hewan)
class Ayam extends Hewan {
    public void suaraHewan() {
        // Body dari abstract method suaraHewan() 
        // ditulis di sini
        System.out.println("Kuuukuruyuuuuukkk...");
    }
}

class Kucing extends Hewan {
    public void suaraHewan() {
        // Body dari abstract method suaraHewan() 
        // ditulis di sini
        System.out.println("Meow...Meow...");
    }
}

public class Main {

    public static void main(String[] args) {
        Ayam ayamku = new Ayam(); // Membuat object Ayam
        ayamku.suaraHewan();
        ayamku.tidur();
        
        Kucing kucingku = new Kucing(); // Membuat object Kucing
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
