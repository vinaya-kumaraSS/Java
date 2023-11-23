package code5;
import java.util.Scanner;
class square
{
	int side;
	public void setside(int n)
	{
		side=n;
	}
	public int area()
	{
		return side*side;
	}
	public int perimeter()
	{
		return 4*side;
	}
}
public class example {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		square s=new square();
		System.out.print("enter side :");
		s.setside(sc.nextInt());
		System.out.println("the area of the square is "+s.area());
		System.out.println("the perimeter of the square is "+s.perimeter());
}
}
