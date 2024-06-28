package demo.com;

import java.util.Random;

public class VariableScope {
	public static void main(String[] args) {

        DiceRoller diceRoller = new DiceRoller();
        
    }
}

class DiceRoller {

    Random random;
    int number = 0;

    public DiceRoller() {
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6) + 1;
        System.out.println("You rolled a " + number);
    }


}
