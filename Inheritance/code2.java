package code16;
class animal
{
	private int age;
	public void roll_no(int n)
	{
		this.age=n;
		System.out.println("the dog age is "+age);
	}
}
class dog extends animal
{
	public void dog_name()
	{
		System.out.println("the dog name is hello");
	}
}
public class example 
{
	public static void main(String[] args)
	{
		dog d=new dog();
		d.dog_name();
		d.roll_no(10);
	}
}
