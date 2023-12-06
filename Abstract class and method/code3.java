package Practise;
abstract class pen
{
    abstract public void write();
    abstract public void refill();
}
class FountainPen  extends pen
{
  public void write()
  {
      System.out.println("Fountainpen is used to write");
  }
  public void refill()
  {
      System.out.println("Fountainpen is used to refill pen");
  }
  public void changeNib()
  {
      System.out.println("Change the nib of the pen");
  }
}
public class code1
{
    public static void main(String[] args) {
        FountainPen f=new FountainPen();
        f.write();
        f.refill();
        f.changeNib();
    }
}
