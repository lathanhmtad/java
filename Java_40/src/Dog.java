public class Dog extends Animal {

	public Dog(String name) {
		super("Dog");
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}
	
	public void bark()
	{
		System.out.println("Gâu gâu");
	}
}