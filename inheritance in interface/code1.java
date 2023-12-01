package code32;
interface parent_interface
{
    void meth1();
    void meth2();
}
interface childparent extends parent_interface
{
    void meth3();
    void meth4();
}
class all_methods implements childparent
{
    public void meth1()
    {
        System.out.println("method 1");
    }
    public void meth2()
    {
        System.out.println("method 2");
    }
    public void meth3()
    {
        System.out.println("method 3");
    }
    public void meth4()
    {
        System.out.println("method 4");
    }
}
public class example {

	public static void main(String[] args) 
	{
		all_methods a=new all_methods();
		a.meth1();
		a.meth2();
		a.meth3();
		a.meth4();
	}

}
