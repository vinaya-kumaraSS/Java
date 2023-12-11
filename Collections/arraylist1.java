package collections;
import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
//        for(int a:l1)
//        {
//            System.out.println(a);
//        }
        for (int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
