package demo.com;

public class ObjectOOP {
	public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar1 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();

        myCar.drive(); // Fixed method name
        myCar.brake();
    }
}

class Car { // Moved Car class outside of Main class
    String make = "Ford";
    String model = "Mustang";
    int year = 2024;
    String color = "red";
    double price = 5000000.00;

    void drive() { // Fixed method name
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brake");
    }


}
