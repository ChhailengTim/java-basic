package serialzer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "John Doe";
        user.password = "password123";
        
        FileOutputStream fileOut = new FileOutputStream("/Users/newmac/Desktop/java-basic/Serializer/UserInfor.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        
        System.out.println("Serialized data is saved in /Users/newmac/Desktop/java-basic/Serializer/UserInfor.ser");
    }
}
