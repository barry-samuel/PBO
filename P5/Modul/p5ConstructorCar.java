package com.pbo;

public class p5ConstructorCar {
    int modelYear;
    String modelName;

    public p5ConstructorCar(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        p5ConstructorCar myCar = new p5ConstructorCar(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
