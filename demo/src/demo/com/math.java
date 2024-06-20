package demo.com;
import java.util.Scanner;

public class math {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double z = 0;
		
		System.out.println("Input x:");
		x = scanner.nextDouble();
		System.out.println("Input y:");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Hypotenuse is "+z);
		
		scanner.close();
	}

}
