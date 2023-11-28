package code23;
abstract class aniaml
{
	public void eat()
	{
		System.out.println("the animal is eating");
	}
	abstract public void eating();
}
class dog extends aniaml
{
	public void eating()
	{
		System.out.println("the dog will eat non-veg");
	}
}
class cat extends aniaml
{
	public void eating()
	{
		System.out.println("the cat will drink");
	}
}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.eating();
		d.eat();
		
		
		cat c=new cat();
		c.eating();
		c.eat();
	}

}
