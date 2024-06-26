package polymorphismlearn;

public class Main {
	public static void main(String[] args) {
	    Car car = new Car();
	    Bicyle bicycle = new Bicyle();
	    Boat boat = new Boat();
	    
	    Vehicle[] vehicle = {car,bicycle,boat};
	    
	    for(Vehicle x : vehicle) {
	      x.go();
	    }
	  }


}
