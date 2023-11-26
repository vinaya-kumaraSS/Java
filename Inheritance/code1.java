package code15;
class base_class
{
	public void print_data()
	{
		System.out.println("The super class");
	}
}
class child_class extends base_class//creating child class
{
	public void details()
	{
		System.out.println("The child class");
	}
}
public class example {
	public static void main(String[] args)
	{
		child_class c=new child_class();//creating object of the child class
		c.print_data();//calling parent class method using child class object
		c.details();//calling child class method using child class object
	}
}
