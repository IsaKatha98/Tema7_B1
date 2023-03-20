package exercises;

public class Dog {
	
	private String name="";
	private int age;
	
	public Dog (String name, int age) {
		
		this.name=name;
		this.age=age;
	}

	public boolean equals (Object obj) {
		
		if (!(obj instanceof Dog)) {
			
			return false;
		}
		
		Dog otherDog = (Dog) obj;
		
		return this.name.equals(otherDog.name)&&this.age == otherDog.age;
	}

}

