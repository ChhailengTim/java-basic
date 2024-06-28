package encapsulations;

public class Encapsulations {
	public static void main(String[] args) {
	    Car car = new Car("Ford","Mastang",2023);
	    
	    car.setYear(2024);
	    
	    System.out.println(car.getName());
	    System.out.println(car.getModel());
	    System.out.println(car.getYear());
	  }
}
