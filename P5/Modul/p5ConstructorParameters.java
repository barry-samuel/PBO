package com.pbo;

import java.util.Scanner;

public class p5ConstructorParameters {
    int x;

    public p5ConstructorParameters(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.printf("Value of 'y' = ");
        int y = userInput.nextInt();
        p5ConstructorParameters myObj = new p5ConstructorParameters(y);

        System.out.println("+++++ x = y +++++");
        System.out.println("Value of 'x' = " + myObj.x);
    }
}
