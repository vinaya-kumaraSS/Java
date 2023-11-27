package code21;
class A
{
	public void method1()
	{
		System.out.println("class A --> method 1");
	}
	public void method2()
	{
		System.out.println("class A --> method 2");
	}
}
class B extends A
{
	@Override
	public void method2()
	{
		System.out.println("class B --> method 2");
	}
	public void method3()
	{
		System.out.println("class B --> method 3");
	}
}
public class example {

	public static void main(String[] args) {
		B b=new B();
		b.method2();
	}

}
