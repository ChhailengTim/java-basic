package gernericclass;

public class Main {
	  public static void main(String[] args) {
	    MyGenericClass<Integer> myInt = new MyGenericClass<Integer>(1);
	    MyGenericClass<Double> myDouble = new MyGenericClass<Double>(3.14);
	    MyGenericClass<Character> myChar = new MyGenericClass<Character>('@');
	    MyGenericClass<String> myString = new MyGenericClass<String>("Hello");
	    
	    System.out.println(myInt.getValue());
	    System.out.println(myDouble.getValue());
	    System.out.println(myChar.getValue());
	    System.out.println(myString.getValue());
	  }

	}
