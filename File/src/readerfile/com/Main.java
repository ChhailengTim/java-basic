package readerfile.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\TIM CHHAILENG\\Desktop\\Testing\\File\\src\\readerfile\\com\\art.txt");
			int data = file.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = file.read();
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
