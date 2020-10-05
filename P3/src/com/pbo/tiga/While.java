package com.pbo.tiga;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i+=2; // i = i + 2
        }

        Scanner myScan = new Scanner(System.in);
        int x = 0;
        int jmlLoop;
        System.out.print("Masukkan jumlah loop: ");
        jmlLoop = myScan.nextInt();
        while (x < jmlLoop){
            System.out.println(x);
            x++;
        }
    }
}
