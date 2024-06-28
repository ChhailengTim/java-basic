package demo.com;

public class AbstractionsLearn {
	public static void main(String[] args) {
        // Person person = new Person();
		HeroLearn hero = new HeroLearn();
       hero.go();
    }

}

abstract class PersonLearn {
    abstract void go();
}

class HeroLearn extends PersonLearn{


	@Override
    void go(){
        System.out.println("Hero is running");
    };
}