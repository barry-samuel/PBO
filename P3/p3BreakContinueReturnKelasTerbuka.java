public class p3BreakContinueReturnKelasTerbuka {
    public static void main(String[] args) {
        
        // Break, Continue, dan Return
        
        int a = 0;
        
        while (true) {
            a++;
            
            if (a == 10) {
                break; 
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if (a == 5) {
                continue;
                // ini adalah keyword untuk memaksa aksi dari awal
            } else if (a == 7) {
                return;
                //
            }
            
            System.out.println("Looping ke-" + a);
        }
        System.out.println("Akhir dari looping");
    }
}
