package com.company;

public class Main {
    public static void main(String[] args) {
        // I found an error
        Car myCar = new Car();
        Car present = new Car("Red", 6);

        myCar.printInfo();
        System.out.println("------------------------------------------------");
        present.printInfo();
    }
}
