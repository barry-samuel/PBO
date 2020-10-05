public class p2IfBersarang {
    public static void main(String[] args){

        // Nested If atau If Bersarang

        int a = 2;
        int b = 10;

        System.out.println("ini adalah awal dari program");

        if (a == 5){
            if (b == 10){
                System.out.println("ini adalah dimana a = 5 dan b = 10");
            } else {
                System.out.println("ini adalah dimana a = 5 dan b bukan 10");
            }
        } else {
            System.out.println("ini adalah dimana a salah");
        }
        
        System.out.println("ini adalah akhir dari program");
        
        /*
          PR Kelas Terbuka
          - 2 Ekspresi (1 Ekspresi Nested)
          - 4 Statement / Outcome
        */
        
        System.out.println("==== PR NESTED IF ====");
        int x = 3, y = 4, z = 4;
        
        System.out.println("Awal Program");
        if (x == 3){
             System.out.println("Statement 1");
        } else {
            if (y == 1){
                System.out.println("Statement 4");
            } else {
                if (z == 12) {
                    System.out.println("Statement 2");
                } else {
                    System.out.println("Statement 3");
                }
            }
        }
        System.out.println("Akhir Program");
    }
}
