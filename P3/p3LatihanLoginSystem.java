import java.util.*;
import java.io.*;

public class p3LatihanLoginSystem {
    public static void main(String[] args) {
        int loginCounter = 1;
        String username, password, dUsr, dPass;
        
        /* Percobaan menggunakan Base64 decoder */
        Base64.Decoder dec = Base64.getDecoder();
        dUsr = new String(dec.decode("dXNlcm5hbWU=")); //username
        dPass = new String (dec.decode("cGFzczEzMzc=")); //pass1337

        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("Login System");
        while ( loginCounter <= 3) {
            
            /* User Input, Username dan Password */
            System.out.print("Username : ");
            username = inputUser.nextLine();
            
            System.out.print("Password : ");
            password = inputUser.nextLine();
            
            /* Compare string Username dan Password */
            if (username.equals(dUsr) && password.equals(dPass)) {
                System.out.println("Username dan Password benar");
                return ;
            } else {
                System.out.println("Username dan Password salah, ini percobaan ke-"+ loginCounter + " dari " + 3);
            }
            loginCounter++;
        }
        System.out.println("Batas maksimal percobaan tercapai.");
    }
}
