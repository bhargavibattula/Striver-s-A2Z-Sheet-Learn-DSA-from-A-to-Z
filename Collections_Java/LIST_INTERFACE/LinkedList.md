# 📘 LinkedList in Java (Complete Notes)

## 🔹 Introduction

LinkedList is part of the Java Collections Framework and is present in the `java.util` package.

- Implements a **doubly linked list**
- Stores elements as **nodes (data + prev + next)**
- Elements are **not stored in contiguous memory**
- Dynamic size (grow/shrink at runtime)
- Maintains insertion order
- Allows duplicate elements
- Not thread-safe (can be synchronized using `Collections.synchronizedList()`)

---

## 🔹 Key Characteristics

- Faster insertions and deletions than ArrayList
- Slower random access (O(N))
- Requires traversal for access
- Uses extra memory (for pointers)

---

## 🔹 Internal Structure

Each node contains:
- Data
- Previous reference
- Next reference

##  NULL <- [Prev | Data | Next] <-> [Prev | Data | Next] <-> ... -> NULL


---

## 🔹 Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println(list);
    }
}

## Real-World Usage
Queue / Deque implementations
Undo/Redo systems
Browser history navigation
Applications with frequent insert/delete

## 🔹 Time Complexity

| Operation      | Complexity |
|---------------|-----------|
| Add (end)     | O(1)      |
| Add (index)   | O(N)      |
| Remove        | O(1) / O(N) |
| Get           | O(N)      |
| Traversal     | O(N)      |



---

# 🔷 Important Interview Topics

---

## 🔹 Basic Operations

- Insert at beginning
- Insert at end
- Insert at position
- Delete node
- Search element
- Traverse list

---

## 🔹 Important Problems

### ⭐ Easy
- Reverse a LinkedList
- Find middle of LinkedList
- Detect loop (cycle detection)
- Remove duplicates
- Merge two sorted lists

---

### ⭐ Medium
- Reverse in k-groups
- Intersection of two LinkedLists
- Add two numbers (LinkedList)
- Remove nth node from end
- Rotate LinkedList

---

### ⭐ Hard
- Flatten LinkedList
- Copy list with random pointer
- LRU Cache (LinkedList + HashMap)
- Reverse nodes in k-group
- Merge k sorted lists

---

## 🔹 Must-Know Algorithms

### 1. Fast & Slow Pointer (Tortoise and Hare)
Used for:
- Cycle detection
- Finding middle

---

### 2. Two Pointer Technique
Used for:
- Removing nth node
- Finding intersection

---

### 3. Reversal Logic
- Iterative (3 pointers)
- Recursive

---

### 4. Dummy Node Technique
- Simplifies edge cases

---

# 🔷 Java LinkedList Methods (Important for Interviews)

---

## 🔸 Adding
- add()
- add(index, element)
- addFirst()
- addLast()

---

## 🔸 Removing
- remove()
- remove(index)
- removeFirst()
- removeLast()

---

## 🔸 Access
- get()
- getFirst()
- getLast()

---

## 🔸 Queue Operations
- offer()
- peek()
- poll()

---

## 🔸 Stack Operations
- push()
- pop()

---

# 🔷 Time Complexity

| Operation      | Complexity |
|---------------|-----------|
| Add (end)     | O(1)      |
| Add (index)   | O(N)      |
| Remove        | O(1) / O(N) |
| Get           | O(N)      |
| Traversal     | O(N)      |

---

# 🔷 ArrayList vs LinkedList (Interview Favorite)

| Feature        | ArrayList        | LinkedList        |
|---------------|------------------|------------------|
| Structure     | Dynamic Array     | Doubly Linked List |
| Access        | O(1)              | O(N)              |
| Insert/Delete | Slow              | Fast              |
| Memory        | Less              | More              |

---

# 🔥 Interview Tips

- Use LinkedList when:
  - Frequent insert/delete
  - Unknown size
- Use ArrayList when:
  - Fast access needed

---

# 🚀 Final Revision Checklist

✔ Types of LinkedList  
✔ Time complexity  
✔ Fast & slow pointer  
✔ Reversal logic  
✔ Important problems  
✔ Java methods  

---
# 📘 LinkedList in Java (Types + Interview Preparation)

---

# 🔷 Types of Linked Lists

---

## 🔹 1. Singly Linked List

- Each node contains:
  - Data
  - Next pointer
  
### ✅ Features
- Simple structure
- Less memory usage
- One-direction traversal

### ❌ Disadvantages
- Cannot traverse backward
- Slower deletion (need previous node)

---

## 🔹 2. Doubly Linked List

- Each node contains:
  - Data
  - Previous pointer
  - Next pointer
  
### ✅ Features
- Two-direction traversal
- Easy insertion/deletion

### ❌ Disadvantages
- Extra memory (for prev pointer)

---

## 🔹 3. Circular Linked List

- Last node points to first node


### ✅ Features
- No NULL pointers
- Efficient for cyclic operations

### ❌ Disadvantages
- Harder to debug
- Infinite loop risk

---

## 🔹 4. Circular Doubly Linked List

- Combines doubly + circular




