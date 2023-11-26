package code20;
class num1
{
	public num1()
	{
		System.out.println("the num1");
	}
	public num1(int a)
	{
		System.out.println("num1 :"+a);
	}
}
class num2 extends num1
{
	public num2()
	{
		System.out.println("the num2");
	}
	public num2(int a,int b)
	{
		super(a);
		System.out.println("num1 + num2 is : "+(a+b));
	}
}
class num3 extends num2
{
	public num3()
	{
		System.out.println("the num3");
	}
	public num3(int a,int b,int c)
	{
		super(a,b);
		System.out.println("num1 + num2 + num3 :"+(a+b+c));
	}
}
public class example 
{
	public static void main(String[] args) 
	{
		num3 n=new num3(3,6,9);
	}
}
