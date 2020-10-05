public class p3LoopingBersarangKelasTerbuka {
    public static void main(String[] args) {
        
        // Looping Bersarang
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i + j == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j <= 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j >= 9) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j >= 9) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i - j <= 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
    }
}
