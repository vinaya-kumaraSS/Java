package collections;
import java.util.*;
public class arraylist4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.remove(1);//remove the elements with index
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(20));
        list.set(2,123);


//        list.clear()    used to clear the array list;
//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }

    }
}
