package copyobjects;

public class CopyObjects {
	public static void main(String[] args) {
	    Car car1 = new Car("Ford","Mustang",2023);
//	    Car car2 = new Car("BMW","Truck",2024);
	    
//	    car2.copy(car1);
	    
	    Car car2 = new Car(car1);
	    
//	    car.setYear(2024);
	    
	    System.out.println(car1);
	    System.out.println(car2);
	    System.out.println();
	    System.out.println(car1.getName());
	    System.out.println(car1.getModel());
	    System.out.println(car1.getYear());
	    System.out.println();
	    System.out.println(car2.getName());
	    System.out.println(car2.getModel());
	    System.out.println(car2.getYear());
	    
	    
	  }

}
