# ArrayList in Java

## Introduction
ArrayList in Java is a resizable array provided in the `java.util` package. Unlike normal arrays, its size can grow or shrink dynamically as elements are added or removed.

### Key Features
- Elements can be accessed using their indices, similar to arrays.
- Duplicates are allowed.
- Elements are stored in the order they are inserted.
- ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually using `Collections.synchronizedList()`.

---

## Internal Working of ArrayList

### Dynamic Array Structure
An ArrayList is internally implemented using a dynamic array (usually an `Object[]` array). This array stores all the elements of the list.

### Automatic Resizing
When the internal array becomes full, the ArrayList automatically increases its capacity by creating a new larger array and copying the existing elements into it.

### Index-Based Access
Elements are stored in contiguous memory locations, allowing fast access using indexes (e.g., `get(index)`), typically in **O(1)** time complexity.

### Element Shifting on Insert/Delete
When an element is added or removed at a specific index, the elements after that position are shifted to maintain order.

---

## Capacity Details

### Default Capacity
When an ArrayList is created using the default constructor, its default capacity is **10**.

### New Capacity Calculation
This increases the capacity by **50% of the old capacity**.

---

## Capacity vs Size

ArrayList maintains two values:

- **Size**: number of elements currently stored  
- **Capacity**: total length of the internal array that can hold elements before resizing is required  

---

## Complexity of Java ArrayList

| Operation                              | Time Complexity     | Space Complexity |
|----------------------------------------|---------------------|------------------|
| Inserting Element at the end           | O(1) (amortized)    | O(1)             |
| Inserting Element at specific index    | O(N)                | O(1)             |
| Removing an element                   | O(N)                | O(1)             |
| Replacing Elements (set)              | O(1)                | O(1)             |
| Traversing elements                  | O(N)                | O(1)             |

---

## Java ArrayList Methods

### Adding Elements
- `add(int index, Object element)`  
  Inserts the specified element at the specified position. Elements are shifted to the right.

- `add(Object o)`  
  Appends the specified element to the end of the ArrayList.

- `addAll(Collection C)`  
  Appends all elements from a collection to the end of the list.

- `addAll(int index, Collection C)`  
  Inserts all elements from a collection starting at a specified index.

---

### Removing Elements
- `remove(int index)`  
  Removes the element at the specified index.

- `remove(Object o)`  
  Removes the first occurrence of the specified element.

- `removeAll(Collection c)`  
  Removes all elements present in the specified collection.

- `removeIf(Predicate filter)`  
  Removes elements that satisfy a given condition.

- `removeRange(int fromIndex, int toIndex)`  
  Removes elements between given indices.

---

### Utility Methods
- `clear()`  
  Removes all elements.

- `clone()`  
  Returns a shallow copy of the ArrayList.

- `contains(Object o)`  
  Checks if element exists.

- `ensureCapacity(int minCapacity)`  
  Ensures minimum capacity.

- `forEach(Consumer action)`  
  Performs an action on each element.

- `get(int index)`  
  Returns element at index.

- `indexOf(Object o)`  
  Returns first occurrence index or -1.

- `lastIndexOf(Object o)`  
  Returns last occurrence index or -1.

- `isEmpty()`  
  Checks if list is empty.

- `listIterator()`  
  Returns iterator.

- `listIterator(int index)`  
  Returns iterator starting at index.

- `retainAll(Collection c)`  
  Retains only matching elements.

- `set(int index, E element)`  
  Replaces element at index.

- `size()`  
  Returns number of elements.

- `spliterator()`  
  Returns a Spliterator.

- `subList(int fromIndex, int toIndex)`  
  Returns portion of list.

- `toArray()`  
  Converts list to array.

- `toArray(Object[] O)`  
  Converts list to array of specific type.

- `trimToSize()`  
  Trims capacity to current size.

---

## Example: Creating an ArrayList

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}