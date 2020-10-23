package com.pbo;

public class p5ClassAttributesMyClass {
    int x = 5;
    int y = 3;

    public static void main(String[] args) {
        p5ClassAttributesMyClass myObj1 = new p5ClassAttributesMyClass();
        p5ClassAttributesMyClass myObj2 = new p5ClassAttributesMyClass();
        myObj2.x = 40;
        myObj2.x = 20;
        System.out.println(myObj1.x);
        System.out.println(myObj1.y);
        System.out.println(myObj2.x);
        System.out.println(myObj2.y);
    }
}
