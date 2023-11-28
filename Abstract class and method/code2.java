package code24;
abstract class shape
{
	public void message()
	{
		System.out.println("the area of the shape");
	}
	abstract public int area();
}
class rectangle extends shape
{
	private int length;
	private int breadth;
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int area()
	{
		return length*breadth;
	}
}

class square extends shape
{
	private int side;
	public square(int side)
	{
		this.side=side;
	}
	public int area()
	{
		return side*side;
	}
}
public class example 
{
	public static void main(String[] args) 
	{
		rectangle r=new rectangle(3,5);
		r.area();
		r.message();
		System.out.println("the area of circle :"+r.area());
		
		square s=new square(3);
		s.area();
		s.message();
		System.out.println("the area of circle :"+s.area());
	}
}
