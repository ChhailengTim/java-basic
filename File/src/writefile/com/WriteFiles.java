package writefile.com;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

	public static void main(String[] args) {
		
		try {
			FileWriter file = new FileWriter("note.txt");
			file.write("Testing \nWe are the world \nWelcome to cambodia \nYes it good");
			file.append("\n(By leng)");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
