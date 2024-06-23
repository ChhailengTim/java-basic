package demo.com;

public class OverLoadMethod {
	public static void main(String[] args) {
        System.out.println(add(34, 76));
        System.out.println(add(45,23,3));
        System.out.println(add(22,1,24, 76));
    }

  static int add(int x, int y) {
        System.out.println("This method #1");
    return x+y;
  }
    static int add(int x, int y, int z) {
        System.out.println("This method #2");
        return x+y+z;
    }
    static int add(int x, int y, int z, int a) {
        System.out.println("This method #3");
        return x+y+z+a;
    }


}
