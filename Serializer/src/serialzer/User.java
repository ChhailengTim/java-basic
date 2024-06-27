package serialzer;  // Ensure this matches the original package during serialization

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String name;
    public String password;
    
    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}
