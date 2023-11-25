package code10;
class student_dec
{
	int id=10;
	public student_dec(String name)
	{
		System.out.println("name :"+name);
		System.out.println("Id :"+id);
	}
}

public class example 
{
	public static void main(String argsp[])
	{
		student_dec s=new student_dec("vinay");
	}
}
