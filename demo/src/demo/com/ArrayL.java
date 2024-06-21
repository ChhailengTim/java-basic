package demo.com;

public class ArrayL {
	public static void main(String[] args) {
		String[] cars = new String[3];
		
		cars[0] = "Toyota";
		cars[1] = "Ford";
		cars[2] = "Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}
}
