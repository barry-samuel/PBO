public class p3ForLoopKelasTerbuka {
    public static void main(String[] args) {
        /* 
            for (inisialisasi; kondisi; step nilai) {
                aksi;
            }
        */
        
        System.out.println("Awal program");
        
        System.out.println("Loop pertama");
        
        for (int nilai = 0; nilai <= 3; nilai++) {
            System.out.println("For loop ke-" + nilai);
        }
        
        System.out.println("Loop kedua");
        
        for (int nilai = 2; nilai < 3; nilai++) {
            System.out.println("For loop ke-" + nilai);
        }
        
        System.out.println("Loop ketiga");
        
        for (int nilai = 5; nilai >= 1; nilai--) {
            System.out.println("For loop ke-" + nilai);
        }
        
        System.out.println("Loop Keempat");
        
        int nilai = 0;
        
        for (; nilai < 9 ;) {
            System.out.println("For loop ke-" + nilai);
            nilai++;
        }
        
        System.out.println("Akhir program");
        
    }
}
