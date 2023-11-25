package code12;
class college
{
	private String name;
	int id;
	//Constructor to set the value
	public college(String name)
	{
		this.name=name;
	}
	public void printname()
	{
		System.out.println(name);
	}
	public int getid()
	{
		return id;
	}
}

public class example 
{
	public static void main(String args[])
	{
		college c=new college("vinay");
		c.printname();
		c.id=123;
		System.out.println("id :"+c.getid());
	}
}
