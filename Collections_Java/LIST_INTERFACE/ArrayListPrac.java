package Collections_Java.LIST_INTERFACE;
import java.util.*;

public class ArrayListPrac{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(10);
        list.set(0 , 100);
        list.add(2,199);
        list.get(0);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
