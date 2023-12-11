package collections;
import java.util.*;
public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list1.addAll(0,list2);
        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }
    }
}
