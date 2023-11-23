package code3;
class details
{
	String name;
	int id;
	int grade[];
	public void student_name() 
	{
		System.out.println("name :"+name);
		System.out.println("Id :"+id);
	}
	public void student_grade()
	{
		for(int a:grade)
		{
			System.out.println("grade :"+a);
		}
	}
}

public class College {
    public static void main(String[] args) 
    {
    	//creating a objects for the 2 students
    	details std1=new details();
    	details std2=new details();
    	
    	System.out.println("<------1st student------>");
    	std1.name="vinay";
    	std1.id=123;
    	std1.grade=new int[]{1,2,3,4};
    	
    	//calling the methods 
    	std1.student_name();
    	std1.student_grade();
    	
    	System.out.println("<------2nd student------>");
    	std2.name="barath";
    	std2.id=123;
    	std2.grade=new int[]{1,5,6,2};
    	
    	//calling the methods 
    	std2.student_name();
    	std2.student_grade();
    }
}
