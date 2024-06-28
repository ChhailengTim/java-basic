package demo.com;

public class ifstatement {
	public static void main(String[] args) {
		int money = 5;
		
		if (money>50) {
			System.out.println("I can spend until end of month");
		}else if (money>=10 && money<=30) {
			System.out.println("I can eat eggs");
		}else {
			System.out.println("Just sleep at home");
		}
	}

}
