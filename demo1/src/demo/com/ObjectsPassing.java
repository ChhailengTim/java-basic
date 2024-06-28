package demo.com;

public class ObjectsPassing {
	public static void main(String[] args) {

        Shop shop = new Shop();
        CarsTest car1 = new CarsTest("Ford");
        CarsTest car2 = new CarsTest("BMW");

        shop.show(car1);
        shop.show(car2);

    }


}


class Shop {

    void show(CarsTest car) {
        System.out.println("The car is " + car.name + " at the shop");
    }

}

class CarsTest{
    String name;
    CarsTest(String name){
        this.name=name;
    }
}