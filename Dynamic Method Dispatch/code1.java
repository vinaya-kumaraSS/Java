package code22;
class phone 
{
	public void name()
	{
		System.out.println("Hi");
	}
	public void battery()
	{
		System.out.println("battry full");
	}
}
class smart_phone extends phone
{
	public void message()
	{
		System.out.println("Good morning");
	}
	public void battery()
	{
		System.out.println("charge Battery");
	}
}
public class example 
{
	public static void main(String[] args) 
	{
		
		//dynamic dispatch is the example for run time polymorphism
		phone s=new smart_phone();
//		s.message();   //not possible
		s.battery();   //possible (because of method over riding
		s.name();	   //possible
		
		
//		smart_phone s=new phone();    //not possible 
	}

}
