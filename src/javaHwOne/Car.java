package javaHwOne;
public class Car {

    //Create a class named "Car" with attributes make, model, and year.
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("This   car Make- " + this.make + " This  car Model- " + this.model + " " +
                " This  car year -  " + this.year);

    }public static void main(String[] args) {

        Car obj = new Car("Honda", "Crv", 2021);

    }
}
