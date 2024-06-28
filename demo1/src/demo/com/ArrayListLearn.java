package demo.com;

import java.util.ArrayList;

public class ArrayListLearn {
	
	public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hotdog");
        food.add("Amok khmer");

        food.set(0, "Sushi"  );
        food.remove(1);
        // food.clear();

        for (int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }


}
