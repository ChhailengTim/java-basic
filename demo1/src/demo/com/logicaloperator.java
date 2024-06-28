package demo.com;

public class logicaloperator {
	public static void main(String[] args) {
		int temp = 2;
		
		if(temp>30) {
			System.out.println("Outside is so hot!!!!");
		}else if(temp>=20 && temp<=30) {
			System.out.println("Outside temp is normal");
		}else {
			System.out.println("Outside is so cool!!!");
		}
	}

}
