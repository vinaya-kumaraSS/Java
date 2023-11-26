package code19;
class base_class
{
	public base_class()
	{
		System.out.println("base class constructor");
	}
	public base_class(int a)
	{
		System.out.println("base class constructor value "+a);
	}
}
class child_class extends base_class
{
	public child_class()
	{
		System.out.println("child class constructor");
	}
	public child_class(int a)
	{
		super(a);
		System.out.println("child class constructor value "+a);
	}
}
public class example {
	public static void main(String[] args) {
		child_class c=new child_class(10);
	}
}
