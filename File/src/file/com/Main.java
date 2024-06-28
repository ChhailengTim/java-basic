package file.com;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("secret_message.txt");
		
		if(file.exists()){
			System.out.println("You have selected file!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
		}else {
			System.out.println("You have not selected!");
		}
	}

}
