package serializers; 

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        
        FileInputStream fileIn = new FileInputStream("/Users/newmac/Desktop/java-basic/Deserializer/UserInfor.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
