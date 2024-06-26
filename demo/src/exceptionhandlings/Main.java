package exceptionhandlings;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    try {
		      System.out.println("Enter x: ");
		      int x = scanner.nextInt();
		      System.out.println("Enter y: ");
		      int y = scanner.nextInt();
		      
		      float z = x/y;
		      
		      System.out.println("X + Y = "+z);
		    }catch(Exception e) {
		      System.out.println(e);
		    }finally {
		      scanner.close();
		    }
		  }

}
