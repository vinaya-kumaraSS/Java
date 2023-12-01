package code30;
interface Animal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
public class example implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    public void say(){
        System.out.println("Hello This is not default mrthod");
    }
    public static void main(String[] args) {
    	example obj1 = new example();
        obj1.bark();
        obj1.say();

    }


}