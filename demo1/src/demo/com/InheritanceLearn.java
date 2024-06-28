package demo.com;

public class InheritanceLearn {
	public static void main(String[] args) {
        CarTest2 carTest2 = new CarTest2();
        CarTest3 carTest3 = new CarTest3();
        
        carTest2.go();
        System.out.println(carTest2.ride);
        carTest3.stop();
        System.out.println(carTest3.doors);
    }

}


class Vehicle {
    double speed;

    void go(){
        System.out.println("Vehicle is moving");
    }

    void stop(){
        System.out.println("Vehicle is stopped");
    }
   
}

class CarTest2 extends Vehicle{
    int ride = 3;
    int doors = 4;
}

class CarTest3 extends CarTest2{
    int wheels = 4;
    int window = 6;
}