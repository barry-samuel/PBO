public class p3DoWhileKelasTerbuka {
    public static void main(String[] args) {
        /* 
            do {
                aksi
            } while (kondisi);
        */
        
        int a = 0;
        boolean kondisi = true;
        
        System.out.println("Awal program");
        
        do {
            a++;
            System.out.println("Do While loop ke-" + a);
            
            if (a == 5) {
                kondisi = false;
            }
            
        } while (kondisi);
        
        System.out.println("Akhir program");
        
    }
}
