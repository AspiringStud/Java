package exercises;

public class Cat {
	private String name;
	private int lives=9;

	
	Cat(String name){
		this.name = name;
	}
	
	void meow()
	{
		System.out.println("meowwwwwwwwwwwwwwwwwwww");
	}
	
	void printName()
	{
		if(name == null)
		{
			System.out.println("I dont know my name");
		}
		else
		{
			System.out.println("My name is : "+name);
		}
	}
	
	void kill()
	{
		lives--;
		if(lives > 0)
		{
			System.out.println("nice try, but I still have "+lives+" lives left");
		}
		else if(lives < 0)
		{
			System.out.println("that's over kill yo!");
		}
		else
		{
			System.out.println("DEAD CAT:(");
		}
	}
	
	
	public static void main(String[] args) {
	
		Cat cat = new Cat("Betty");
		cat.meow();
		cat.printName();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		cat.kill();
		
		
	}


}
