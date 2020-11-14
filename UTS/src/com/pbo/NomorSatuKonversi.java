package com.pbo;

import java.util.Scanner;

public class NomorSatuKonversi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double result, IDR;
        double USD = 14591;

        System.out.println("============================");
        System.out.println("Konversi IDR ke USD");
        System.out.println("============================");
        System.out.print("IDR = Rp ");
        IDR = userInput.nextDouble();
        result = IDR / USD;
        System.out.print("USD = " + "\u0024 " + result + "\n");
        System.out.println("============================");
    }
}