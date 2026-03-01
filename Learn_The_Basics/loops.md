# 🔁 Java Loops — When to Use What

Loops execute a block of code multiple times.

In Java, the most commonly used loops are:

- for loop
- while loop
- do-while loop

---

# 🟢 FOR LOOP

## 📌 When to Use
Use a **for loop** when:
- Number of iterations is known
- Working with arrays
- Using a counter
- Clear start and end condition

👉 Best for fixed repetitions.

## 🧠 Syntax
```java
for(initialization; condition; update) {
    // code
}
```

## ✅ Example 1: Print 1 to 5
```java
public class ForExample1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

## ✅ Example 2: Array Traversal
```java
public class ForExample2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

---

# 🟡 WHILE LOOP

## 📌 When to Use
Use a **while loop** when:
- Number of iterations is unknown
- Depends on user input
- Condition changes dynamically
- Waiting for something to happen

👉 Best for condition-based repetition.

## 🧠 Syntax
```java
while(condition) {
    // code
}
```

## ✅ Example 1: Print 1 to 5
```java
public class WhileExample1 {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

## ✅ Example 2: User Input Until 0
```java
import java.util.Scanner;

public class WhileExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;

        while(number != 0) {
            System.out.print("Enter number (0 to stop): ");
            number = sc.nextInt();
        }

        System.out.println("Loop ended.");
    }
}
```

---

# 🔵 DO-WHILE LOOP

## 📌 When to Use
Use **do-while** when:
- Loop must execute at least once
- Condition checked after execution

👉 Best when first execution is mandatory.

## 🧠 Syntax
```java
do {
    // code
} while(condition);
```

## ✅ Example
```java
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();
        } while(num != 0);
    }
}
```

---

# 🔴 Key Differences

| Feature | For | While | Do-While |
|----------|------|--------|-----------|
| Iterations Known? | Yes | No | Usually No |
| Condition Check | Before | Before | After |
| Runs At Least Once? | No | No | Yes |
| Best For | Counting, arrays | User input | Menu-driven programs |

---

# 🧠 Quick Memory Trick

FOR → Fixed  
WHILE → Waiting  
DO-WHILE → Do first, check later  

---

# 🎯 Interview Rule

- Use `for` for counters and arrays  
- Use `while` for condition-driven loops  
- Use `do-while` when execution must happen at least once  

Clean code = Right loop choice.
