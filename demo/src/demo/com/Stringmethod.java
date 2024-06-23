package demo.com;

public class Stringmethod {
	public static void main(String[] args) {
        // String[][] cars = new String[3][3];
        String[][] cars = {{"BMW", "Volvo", "Ford"}, {"Tesla", "Honda", "Toyota"},{"Ferrari", "Lamborghini", "Bugatti"}};

        // cars[0][0] = "BMW";
        // cars[0][1] = "Mercedes";
        // cars[0][2] = "Audi";
        // cars[1][0] = "Porsche";
        // cars[1][1] = "Lamborghini";
        // cars[1][2] = "Ferrari";
        // cars[2][0] = "Tesla";
        // cars[2][1] = "Volvo";
        // cars[2][2] = "Lexus";

        for (int i=0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] );
            }
        }
    }


}
