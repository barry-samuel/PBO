package com.pbo;

// Abstract class
abstract class Person {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // Abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
    public int graduationYear = 2018;
    public void study() { // The body of the abstract methode is provided here
        System.out.println("Study");
    }
}

public class p5ModifiersMyClass {
    public static void main(String[] args) {
        // Create an object of the Student class (wich inherits attributes and method from Person class)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age " + myObj.age);
        System.out.println("Grad. Year: " + myObj.graduationYear);
        myObj.study();
    }
}