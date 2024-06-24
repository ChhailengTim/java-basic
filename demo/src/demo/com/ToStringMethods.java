package demo.com;

public class ToStringMethods {
	public static void main(String[] args) {
		CarTest car = new CarTest();

        System.out.println(car.toString());
    }


}

class CarTest {

    String name= "BMW";
    String color= "Black";
    int speed= 300;
    int price= 2000000;

    public String toString(){
        return "Name: " + name + "\nColor: " + color + "\nSpeed: " + speed + "\n"+ "Price: " + price;
    }
}