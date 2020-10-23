package com.pbo;

// Create a MyClass class
public class p5ConstructorMyClass {
    int x; // Create class attribute

    // Create a class constructor for the MyClass class
    public p5ConstructorMyClass() {
        x = 5; // Set the initial value for the 'x' class attribute of MyClass class
    }

    public static void main(String[] args) {
        p5ConstructorMyClass myObj = new p5ConstructorMyClass(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of 'x'
    }
}
