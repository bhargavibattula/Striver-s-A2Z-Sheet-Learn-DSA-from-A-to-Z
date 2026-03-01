# Functions: Pass by Value vs Pass by Reference

Before jumping into code, let’s understand this using a real-life analogy.

Imagine you are helping your friend prepare a resume. There are two ways to help:

- You take a **photocopy** of their resume and edit it. The original remains unchanged.  
  → This is **Pass by Value**

- You take the **actual resume** and edit it. Now the original changes.  
  → This is **Pass by Reference**

That is exactly what happens in programming.

---

# What is Pass by Value?

When a variable is passed by value:

- A copy of the variable is created.
- The function works on that copy.
- The original variable remains unchanged.

### Real-life analogy

You submit a Xerox copy of your mark sheet.  
If someone writes on it, your original is safe.

### Key Characteristics

- Function receives a separate copy
- Changes inside function do NOT affect original variable
- Safe but can be less efficient for large objects

---

# What is Pass by Reference?

When a variable is passed by reference:

- The function receives the original variable (memory address).
- Changes inside the function affect the original.

### Real-life analogy

You give someone your real debit card.  
If money is withdrawn, your actual balance changes.

### Key Characteristics

- Function receives original memory reference
- Changes reflect outside the function
- Useful for modifying multiple values

---

# Comparison Table

| Feature | Pass by Value | Pass by Reference |
|----------|---------------|------------------|
| What is passed? | Copy of variable | Memory reference |
| Original modified? | No | Yes |
| Safety | High | Lower |
| Memory usage | More (copies) | Less |

---

# Pass by Value & Reference in Different Languages

---

# C++

## Pass by Value

```cpp
#include <iostream>
using namespace std;

void modify(int a) {
    a = a + 10;
}

int main() {
    int x = 5;
    modify(x);
    cout << x << endl;  // Output: 5
    return 0;
}
```

## Pass by Reference

```cpp
#include <iostream>
using namespace std;

void modify(int &a) {
    a = a + 10;
}

int main() {
    int x = 5;
    modify(x);
    cout << x << endl;  // Output: 15
    return 0;
}
```

---

# Java

Java is **always pass-by-value**.

But for objects, the value being copied is the reference.

---

## Primitive Example (Pass by Value)

```java
public class Main {
    static void modify(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {
        int x = 5;
        modify(x);
        System.out.println(x);  // Output: 5
    }
}
```

---

## Objects (Reference Passed by Value)

```java
class Wrapper {
    int value = 5;
}

public class Main {
    static void modify(Wrapper obj) {
        obj.value += 10;
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        modify(w);
        System.out.println(w.value);  // Output: 15
    }
}
```

⚠ Important: Reassigning the object inside the function will NOT change the caller’s reference.

---

# Python

Python uses **pass-by-object-reference** (also called pass-by-assignment).

---

## Immutable Type Example

```python
def modify(a):
    a = a + 10

x = 5
modify(x)
print(x)  # Output: 5
```

Integers are immutable, so it behaves like pass-by-value.

---

## Mutable Type Example

```python
def modify(lst):
    lst.append(10)

nums = [5]
modify(nums)
print(nums)  # Output: [5, 10]
```

Lists are mutable, so changes reflect outside.

---

# JavaScript

## Pass by Value (Primitives)

```javascript
function modify(a) {
    a = a + 10;
}

let x = 5;
modify(x);
console.log(x); // Output: 5
```

---

## Objects (Reference to Object)

```javascript
function modify(obj) {
    obj.value += 10;
}

let data = { value: 5 };
modify(data);
console.log(data.value); // Output: 15
```

---

# Final Language Comparison

| Language | Pass by Value | Pass by Reference | Special Notes |
|----------|---------------|------------------|---------------|
| C++ | Yes (default) | Yes (using &) | Supports both |
| Java | Always pass-by-value | No true pass-by-reference | Objects copy reference |
| Python | Immutable behave like value | Mutable behave like reference | Actually pass-by-object-reference |
| JavaScript | Primitives by value | Objects by reference | Reassignment breaks link |

---

# Conclusion

- Pass by Value → safer, original data unchanged.
- Pass by Reference → efficient, allows modification.
- Java is strictly pass-by-value.
- Understanding this is crucial for debugging and interviews.
