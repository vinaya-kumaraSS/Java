package code7;
class employee
{
	private String name;
	private int id;
	public void setname(String n)
	{
		this.name=n;
	}
	public String getname()
	{
		return name;
	}
	public void setid(int n)
	{
		this.id=n;
	}
	public int getid()
	{
		return id;
	}
}
public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		
//		e.name="vinay";
//		e.id=123;
		e.setname("vinay");
		e.setid(123);
//		
		
		
		System.out.println(e.getname());
		System.out.println(e.getid());
	}

}
