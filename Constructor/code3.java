package code11;
class employee_dec
{
	private String name;
	private int id;
	private String dept;
	public employee_dec(String name,int id, String dept)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	public void printdect()
	{
		System.out.println("name :"+name);
		System.out.println("id :"+id);
		System.out.println("dept :"+dept);
	}
}
public class example {

	public static void main(String[] args) {
		employee_dec ed=new employee_dec("vinay",123,"cse");
		ed.printdect();
	}

}
