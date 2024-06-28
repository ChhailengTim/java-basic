package demo.com;

public class OverloadedConstructors {
	public static void main(String[] args) {
        Fruits fruits = new Fruits("Mango", "Yellow", "Sweet");
        System.out.println("Fruits: " + fruits.name);
        System.out.println("Fruits: " + fruits.color);
        System.out.println("Fruits: " + fruits.tast);
        
        
    }
}


class Fruits {
    String name;
    String color;
    String tast;
    String smell;

    Fruits(){
    }

    Fruits(String name){
        this.name=name;
    }

    Fruits(String name,String color){
        this.name=name;
        this.color=color;
    }

    Fruits(String name,String color,String tast){
        this.name=name;
        this.color=color;
        this.tast=tast;
    }

    Fruits(String name,String color,String tast,String smell){
        this.name=name;
        this.color=color;
        this.tast=tast;
        this.smell=smell;
    }
}