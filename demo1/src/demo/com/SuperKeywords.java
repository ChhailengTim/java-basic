package demo.com;

public class SuperKeywords {
	public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "Bruce Wayne");
        Hero hero2 = new Hero("Superman", 38, "Clark Kent");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }

}


class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name +", Age: " + age;
    }
}

class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        super(name,age);
        this.power = power;
    }

    public String toString(){
        return super.toString() + this.power;
    }
}