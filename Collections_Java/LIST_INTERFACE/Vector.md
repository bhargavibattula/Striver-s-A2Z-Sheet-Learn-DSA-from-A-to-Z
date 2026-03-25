# 📦 Vector in Java – Complete Notes

## 📌 Introduction
Vector is a dynamic array in Java, part of the `java.util` package.

- Dynamic size (grows/shrinks automatically)
- Maintains insertion order
- Allows duplicate and null values
- Thread-safe (all methods are synchronized)
- Legacy class (older than ArrayList)

👉 ArrayList is generally preferred when thread safety is not required.

---

## 🧠 Internal Working
- Uses a dynamic array internally
- Automatically resizes when capacity is exceeded
- All methods are synchronized → thread-safe

---

## ⚙️ Constructors

```java
Vector<Integer> v1 = new Vector<>();                // Default (capacity = 10)
Vector<Integer> v2 = new Vector<>(20);              // Initial capacity
Vector<Integer> v3 = new Vector<>(10, 5);           // Capacity + increment
Vector<Integer> v4 = new Vector<>(collection);      // From collection


📏 Capacity
Default capacity = 10
Growth Formula
newCapacity = oldCapacity * 2

➕ Basic Operations
Adding Elements
Vector<Integer> v = new Vector<>();

v.add(10);
v.add(20);
v.add(1, 99);

System.out.println(v);
Updating Elements
v.set(0, 100);

Removing Elements
v.remove(1);                      // by index
v.remove(Integer.valueOf(20));    // by value

// using loop
for(int i = 0; i < v.size(); i++){
    System.out.print(v.get(i) + " ");
}

// using for-each
for(int x : v){
    System.out.print(x + " ");
}

🛠️ Methods
➤ Adding
add(E e)
add(int index, E element)
addAll(Collection<? extends E> c)
addAll(int index, Collection<? extends E> c)
addElement(E obj)
➤ Access
get(int index)
elementAt(int index)
firstElement()
lastElement()
➤ Removing
remove(int index)
remove(Object o)
removeAll(Collection<?> c)
removeAllElements()
removeElement(Object obj)
removeElementAt(int index)
removeIf(Predicate filter)
➤ Utility
size()
capacity()
isEmpty()
clear()
clone()
contains(Object o)
containsAll(Collection<?> c)
indexOf(Object o)
lastIndexOf(Object o)
ensureCapacity(int minCapacity)
trimToSize()
set(int index, E element)
setSize(int newSize)
toArray()
toArray(T[] a)
toString()
iterator()
listIterator()
spliterator()
➤ Special
copyInto(Object[] array)
elements() // returns Enumeration
⏱️ Time Complexity
Operation	Complexity
Add (end)	O(1) amortized
Add (index)	O(N)
Remove	O(N)
Get	O(1)
Set	O(1)
Traversal	O(N)
⚔️ Vector vs ArrayList
Feature	Vector	ArrayList
Thread Safety	Yes	No
Performance	Slower	Faster
Legacy	Yes	No
Usage	Rare	Preferred
💡 Real-World Usage
Multi-threaded environments
Legacy systems
When built-in synchronization is required
🎯 Interview Topics
Must Know
Vector vs ArrayList
Thread safety concept
Capacity growth
Synchronization overhead
🧪 Interview Questions
Q1
Vector<Integer> v = new Vector<>(2);
v.add(10);
v.add(20);
v.add(30);
System.out.println(v.capacity());

👉 Output: 4

Q2

👉 Default capacity of Vector
Answer: 10

Q3

👉 Is Vector thread-safe?
Answer: Yes

Q4

👉 Which is faster: Vector or ArrayList?
Answer: ArrayList

🔥 Summary
Vector is a thread-safe dynamic array
Uses synchronized methods → slower
Doubles capacity when full
Mostly replaced by ArrayList
🚀 Pro Tip
Use Vector → when thread safety is required
Use ArrayList → for better performance