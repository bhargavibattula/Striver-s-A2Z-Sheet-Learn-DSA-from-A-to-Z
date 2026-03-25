package Collections_Java.LIST_INTERFACE;

import java.util.*;

public class ArrayListPrac {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(): " + list);

        // add(index, element)
        list.add(1, 99);
        System.out.println("After add(index, element): " + list);

        // get()
        System.out.println("get(0): " + list.get(0));

        // set()
        list.set(0, 100);
        System.out.println("After set(): " + list);

        // remove(index)
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // remove(Object)
        list.remove(Integer.valueOf(99));
        System.out.println("After remove(Object): " + list);

        // size()
        System.out.println("Size: " + list.size());

        // contains()
        System.out.println("Contains 20? " + list.contains(20));

        // indexOf()
        System.out.println("Index of 20: " + list.indexOf(20));

        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // addAll()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(200);
        list2.add(300);
        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // addAll(index, collection)
        list.addAll(1, list2);
        System.out.println("After addAll(index): " + list);

        // removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);

        // retainAll()
        list.add(200);
        list.add(300);
        list.retainAll(list2);
        System.out.println("After retainAll(): " + list);

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // isEmpty after clear
        System.out.println("Is Empty after clear? " + list.isEmpty());

        // ensureCapacity()
        list.ensureCapacity(50);
        System.out.println("Capacity ensured (no visible change)");

        // trimToSize()
        list.trimToSize();
        System.out.println("Trimmed to size");

        // toArray()
        list.add(1);
        list.add(2);
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // forEach()
        System.out.print("forEach(): ");
        list.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // subList()
        list.add(3);
        list.add(4);
        System.out.println("SubList (0,2): " + list.subList(0, 2));

        // clone()
        ArrayList<Integer> cloned = (ArrayList<Integer>) list.clone();
        System.out.println("Cloned list: " + cloned);

        // listIterator()
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
    }
}