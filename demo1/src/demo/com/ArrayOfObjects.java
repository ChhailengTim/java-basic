package demo.com;

public class ArrayOfObjects {
	public static void main(String[] args) {
        // Food[] simplenote = new Food[3];

        Food food0 = new Food("Donut");
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Noodles");

        // simplenote[0] = food0;
        // simplenote[1] = food1;
        // simplenote[2] = food2;

        Food[] simplenote = {food0, food1, food2};

        System.out.println(simplenote[0].name);
        System.out.println(simplenote[1].name);
        System.out.println(simplenote[2].name);
    }


}


class Food {
    String name;
    Food(String name){
        this.name = name;
    }
}