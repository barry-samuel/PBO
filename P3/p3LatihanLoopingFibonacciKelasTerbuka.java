import java.util.*;

public class p3LatihanLoopingFibonacciKelasTerbuka {
    public static void main(String[] args) {
        // fn = fn-1 + fn-2
        // Menghitung nilai deret fibonacci ke-n
        
        int f_n, f_n_1, f_n_2, n, i;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke-: ");
        n = inputUser.nextInt();
        
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        
        //For Loop
        System.out.println("==== For Loop");
        for(i = 1; i <= n; i++) {
            System.out.println("Nilai ke-" + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        
        //While Loop
        System.out.println("==== While Loop");
        i = 1;
        while (i <= n) {
            System.out.println("Nilai ke-" + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }
        
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        
        //Do While Loop
        System.out.println("==== Do While Loop");
        i = 1;
        do {
            System.out.println("Nilai ke-" + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        } while (i <= n);
        
    }
}
