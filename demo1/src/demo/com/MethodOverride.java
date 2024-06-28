package demo.com;

public class MethodOverride {
	public static void main(String[] args) {
        Animal animal =  new Animal();
        Dog dog = new Dog();

        dog.speak();
    }
}


class Animal {

    void speak(){
        System.out.println("The animal is speak.");
    }
}

class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("The dog is speak.");
    }
}