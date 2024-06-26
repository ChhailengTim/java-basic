package dynamicpolymorphisms;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Animals animals;
	    
	    Dog dog = new Dog();
	    Cat cat = new Cat();
	    
	    System.out.println("What do you want ot test??");
	    System.out.println("(1=Dog) or 2=Cat");
	    int input = scanner.nextInt();
	    
	    if(input==1) {
	      animals = new Dog();
	      animals.speak();
	    }else if(input==2) {
	      animals = new Cat();
	      animals.speak();
	    }else {
	      animals = new Animals();
	      System.out.println("input is invialid");
	    }
	  }



}
