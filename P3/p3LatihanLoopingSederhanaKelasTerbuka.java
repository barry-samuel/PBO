import java.util.*;

public class p3LatihanLoopingSederhanaKelasTerbuka {
    public static void main(String[] args) {
        // Program untuk menjumlahkan angka dengan rentang
        
        int nilaiAwal, nilaiAkhir, total, countAwal;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        
        countAwal = nilaiAwal;
        
        //While Loop
        total = 0;
        System.out.println("===== While Loop");
        while(nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        
        //Do Loop
        nilaiAwal = countAwal;
        total = 0;
        System.out.println("===== Do While Loop");
        do {
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        } while(nilaiAwal <= nilaiAkhir);
        
        //For Loop
        nilaiAwal = countAwal;
        total = 0;
        System.out.println("===== For Loop");
        for(; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
        }
    }
}
