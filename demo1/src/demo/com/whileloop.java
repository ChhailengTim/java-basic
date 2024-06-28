package demo.com;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        
        while (name.isBlank()) {
            System.out.println("Press q or Q to exit the game");
            name = scanner.nextLine();
            if (name.equals("q") && name.equals("Q")) {
                System.out.println("You are exited!");
                break;
            }
            System.out.println("You are playing");
        }
        
        scanner.close();  
    }
}
