package demo.com;

import java.util.ArrayList;

public class TwoDarraylist {
	public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        
        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();

        produceList.add("kale");
        produceList.add("broccoli");
        produceList.add("spinach");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("water");
        drinksList.add("coke");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0));

        
    }


}
