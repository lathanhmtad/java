public class Test
{
	public static void main(String[] args) {
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		Animal a = new Cat();
		
		cat.eat();
		cat.meow();
		
		bird.eat();
		bird.fly();
				
	}
}