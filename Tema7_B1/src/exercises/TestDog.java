package exercises;

public class TestDog {
	
	public static void main(String[]args) {
		
		Dog myDog= new Dog ("Buddy",3);
		Dog otherDog= new Dog ("Buddy", 3);
		
		System.out.println(myDog==otherDog);
		System.out.println(myDog.equals(otherDog));
	}
}
