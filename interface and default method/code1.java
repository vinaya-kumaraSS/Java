package code28;
interface phone
{
	void call();
	void camera();
	default void add_video_feature()
	{
		System.out.println("Take video");
	}
}
class phone_details implements phone
{
	public void call()
	{
		System.out.println("Pick the call");
	}
	public void camera()
	{
		System.out.println("Take one Photo");
	}
	public void add_video_feature()
	{
		System.out.println("Take video inside phone detsils");
	}	
}
public class example {

	public static void main(String[] args) {
		phone_details p=new phone_details();
		p.call();
		p.camera();
		p.add_video_feature();
	}
}
