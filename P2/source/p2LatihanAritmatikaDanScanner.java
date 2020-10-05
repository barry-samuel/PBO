import java.util.Scanner;

public class p2LatihanAritmatikaDanScanner {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        
        /* Membuat perhitungan luas dan volume persegi panjang
         * Luas = Panjang * Lebar
         * Volume = Tinggi * Luas
         */
         
         System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
         System.out.print("Panjang = ");
         panjang = userInput.nextInt();
         System.out.print("Lebar = ");
         lebar = userInput.nextInt();
         
         luas = panjang * lebar;
         System.out.println("Luas = " + luas);
         
         System.out.println("MENGHITUNG VOLUME PERSEGI PANJANG");
         System.out.print("Tinggi = ");
         tinggi = userInput.nextInt();
         volume = luas * tinggi;
         System.out.println("Volume = " + volume);
         
    }
}
