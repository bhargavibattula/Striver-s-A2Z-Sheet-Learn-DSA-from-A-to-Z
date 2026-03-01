# Java Scanner Input for All Basic Data Types

This document explains how to take input for all commonly used data types in Java using the `Scanner` class.

---

# 1️⃣ Import Scanner

```java
import java.util.Scanner;
```

---

# 2️⃣ Integer (`int`)

## Example Program

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Integer: " + num);
    }
}
```

### Input
```
25
```

### Output
```
Integer: 25
```

---

# 3️⃣ Long (`long`)

Used for large numbers.

```java
long num = sc.nextLong();
```

### Example

Input:
```
12345678900
```

---

# 4️⃣ Float (`float`)

⚠️ Important: Use `nextFloat()`

```java
float num = sc.nextFloat();
```

### Example Program

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();
        System.out.println("Float: " + num);
    }
}
```

### Input
```
12.5
```

### Output
```
Float: 12.5
```

---

# 5️⃣ Double (`double`)

More precise than float.

```java
double num = sc.nextDouble();
```

---

# 6️⃣ String (Single Word)

```java
String word = sc.next();
```

Reads only one word (stops at space).

Input:
```
Hello
```

---

# 7️⃣ String (Full Line)

```java
String line = sc.nextLine();
```

Reads entire line including spaces.

Input:
```
Hello Bharu Welcome
```

---

# 8️⃣ Character (`char`)

Java has no `nextChar()`, so use:

```java
char ch = sc.next().charAt(0);
```

Input:
```
A
```

---

# 9️⃣ Boolean (`boolean`)

```java
boolean value = sc.nextBoolean();
```

Input:
```
true
```

Output:
```
true
```

---

# 🔟 Integer Array

```java
int n = sc.nextInt();
int[] arr = new int[n];

for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
}
```

---

# 1️⃣1️⃣ 2D Array (Matrix)

```java
int n = sc.nextInt();
int m = sc.nextInt();

int[][] matrix = new int[n][m];

for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++){
        matrix[i][j] = sc.nextInt();
    }
}
```

---

# ⚠️ Important Scanner Rule

If using `nextInt()`, `nextFloat()`, `nextDouble()`, `nextLong()`  
and then using `nextLine()`,

Always clear the buffer:

```java
sc.nextLine();
```

---

# 🏆 Quick Reference Table

| Data Type | Method |
|------------|--------|
| int | `nextInt()` |
| long | `nextLong()` |
| float | `nextFloat()` |
| double | `nextDouble()` |
| String (word) | `next()` |
| String (line) | `nextLine()` |
| char | `next().charAt(0)` |
| boolean | `nextBoolean()` |

---

# 📌 Conclusion

Use the correct `Scanner` method based on the data type.  
Be careful when mixing `nextLine()` with other input methods.