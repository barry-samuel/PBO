import java.util.Scanner;

public class p2PengelompokanOperasiAritmatika {
    public static void main(String[] args) {
        
        /* kesimpulannya adalah
         * perkalian atau pembagian akan dilakukan terlebih dahulu
         *
         * jika dilakukan perkalian dan pembagian, maka
         * akan dilakukan operasinya dari kiri ke kanan
         * 
         * Ingat! Order of Operation (PEMDAS)
         */
         
        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // Menggunakan pengelompokan operasi dengan "( )"
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        
        // Perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUDRAT");
        int m,x,c;

        System.out.print("Nilai 'x' = ");
        x = userInput.nextInt();
        System.out.print("Gradient 'm' = ");
        m = userInput.nextInt();
        System.out.print("Bias 'c' = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("Nilai 'y' = " + y);
    }
}
