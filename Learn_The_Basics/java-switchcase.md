# Java Switch Case – Complete Guide with Examples

The `switch` statement is used to compare one variable against multiple fixed values.

---

# 1️⃣ Basic Switch with int

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
```

### Input
```
2
```

### Output
```
Tuesday
```

---

# 🔥 Why break is Important

Without `break`, Java executes all cases after the matched case.

Example (No break):

```java
int x = 2;

switch(x) {
    case 1:
        System.out.println("A");
    case 2:
        System.out.println("B");
    case 3:
        System.out.println("C");
}
```

### Output
```
B
C
```

This is called **fall-through behavior**.

---

# 2️⃣ Switch with String

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();

        switch(fruit) {
            case "apple":
                System.out.println("Red Fruit");
                break;
            case "banana":
                System.out.println("Yellow Fruit");
                break;
            default:
                System.out.println("Unknown Fruit");
        }
    }
}
```

### Input
```
banana
```

### Output
```
Yellow Fruit
```

---

# 3️⃣ Multiple Cases Together

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;

            default:
                System.out.println("Invalid Month");
        }
    }
}
```

### Input
```
1
```

### Output
```
Winter
```

---

# 4️⃣ Enhanced Switch (Java 14+)

Cleaner syntax. No break required.

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid Day");
        }
    }
}
```

---

# 5️⃣ Switch as Expression (Returns Value)

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        String result = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid Day";
        };

        System.out.println(result);
    }
}
```

---

# ✅ When to Use Switch

Use `switch` when:
- Comparing ONE variable
- Against fixed values
- Cleaner alternative to multiple `else if`

---

# ❌ When NOT to Use Switch

Cannot use:
- Ranges (`>`, `<`, `>=`)
- Complex conditions (`&&`, `||`)

Example not allowed:

```java
case age > 18:
```

---

# 🧠 Allowed Data Types

- int
- byte
- short
- char
- String
- enum

---

# 📌 Summary

- Always use `break` in traditional switch.
- Without break → fall-through happens.
- Enhanced switch (Java 14+) does not need break.
- Best for fixed value comparisons.
