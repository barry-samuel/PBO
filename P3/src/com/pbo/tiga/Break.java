package com.pbo.tiga;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
