package code14;
class cylinder
{
	private int radius,height;
	public void set_radius(int r)
	{
		this.radius=r;
	}
	public void set_height(int h)
	{
		this.height=h;
	}
	public int get_radius()
	{
		return radius;
	}
	public int get_height()
	{
		return height;
	}
	public void area()
	{
		System.out.println("the area of circle is "+(height*radius));
	}
}
public class example {

	public static void main(String[] args) 
	{
		cylinder c=new cylinder();
		c.set_radius(10);
		c.set_height(20);
		System.out.println("radius :"+c.get_radius());
		System.out.println("heigth :"+c.get_height());
		c.area();
	}
}
