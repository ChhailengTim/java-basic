package demo.com;

public class StaticKeywords {
	public static void main(String[] args) {
        Friend friend1 = new Friend("Dom");
        Friend friend2 = new Friend("Hong");
        Friend friend3 = new Friend("TY");
        Friend friend4 = new Friend("Rak");

        Friend.displayFriends();
        
    }
}


class Friend {
    String name;
    static int numberOfFreinds;

    Friend(String name){
        this.name = name;
        numberOfFreinds++;
    }

    static void displayFriends(){
        System.out.println("Your have "+numberOfFreinds+" friends");
    }
}