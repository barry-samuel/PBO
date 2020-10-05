import java.util.*;

public class p2TernaryOperator {
    public static void main(String[] args){
     
        // Ternary Operator
        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan nilai: ");
        input = inputUser.nextInt();

        // variable x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);
        
        /* Jika memakai If else
        if (input==10){
            x = input*input;
        }else{
            x = input/2;
        }
        */
        
        System.out.println("Hasilnya " + x);
    }
}
