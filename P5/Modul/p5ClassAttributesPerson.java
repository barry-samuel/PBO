package com.pbo;

public class p5ClassAttributesPerson {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        p5ClassAttributesPerson myObj = new p5ClassAttributesPerson();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
