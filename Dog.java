package Dog;

public class Dog 
{
	String breed ;
	String color ;
	String name ;
	boolean shot_status ;
	int age ;
	int weight ;
	int height ;
	
	void bark(boolean b ) 
	{
		if ( b== true)
			System.out.println("Dog is barking");
		else
			System.out.println("Dog is not barking");
	}
	void run(boolean r ) 
	{
		if ( r== true)
			System.out.println("Dog is running");
		else
			System.out.println("Dog is not running");
	}

	
	
	
	public static void main(String[] args) 
	{
		Dog Jeff = new Dog();
		Jeff.bark(true);
	
	}

}
