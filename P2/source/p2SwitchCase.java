import java.util.*;

public class p2SwitchCase {
    public static void main(String[] args){
        
        // Switch Case
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input = inputUser.next();

        // Ekspresinya berupa satuan (int,long,byte,short), string, atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }
        System.out.println("Program Selesai");

    }
}
