package code31;
class print_message
{
	private void hello()
	{
		System.out.println("Hello World");
	}
	public void morning()
	{
		hello();
		System.out.println("Good Morning");
	}
}
public class example {
	public static void main(String[] args) {
		print_message pm=new print_message();
		pm.morning();
	}

}
