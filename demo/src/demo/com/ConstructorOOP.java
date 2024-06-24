package demo.com;

public class ConstructorOOP {
	public static void main(String[] args) {
        Human human1 = new Human("Leng",15,1.5);
        Human human2 = new Human("Long",23,1.8);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();
    }
}

class Human { 

    String name;
    int age;
    double height;

    Human(String name, int age, double height){
        this.name =  name;
        this.age = age;
        this.height = height;
    }

    
    void eat() { 
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }


}
