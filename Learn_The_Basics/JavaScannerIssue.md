# Java Scanner Issue: `nextInt()` and `nextLine()` Problem

## 📌 Problem

When using `nextInt()` before `nextLine()`, the first `nextLine()` may read an empty string.

This is one of the most common input mistakes in Java.

---

## ❌ Wrong Example

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        System.out.println("Number: " + n);
        System.out.println("Line1: " + line1);
        System.out.println("Line2: " + line2);
    }
}
```

### 📝 Input
```
5
Hi
Bye
```

---

## 🔎 What Happens Internally

1. `nextInt()` reads `5`
2. It does NOT consume the newline character (`\n`)
3. That leftover newline remains in the input buffer
4. The first `nextLine()` reads only that newline
5. So `line1` becomes an empty string

---

## ⚠️ Output Produced

```
Number: 5
Line1:
Line2: Hi
```

Notice:
- `line1` is empty
- `"Bye"` is never read

---

## 🧠 Why This Happens

- `nextInt()` reads only the number
- `nextLine()` reads everything until a newline
- The leftover newline gets captured first

---

## ✅ Correct Way to Fix

Add one extra `nextLine()` after `nextInt()` to clear the buffer.

```java
int n = sc.nextInt();
sc.nextLine(); // Clear leftover newline

String line1 = sc.nextLine();
String line2 = sc.nextLine();
```

---

## 🏆 Golden Rule

If you use:
- `nextInt()`
- `nextDouble()`
- `nextLong()`
- `next()`

and then want to use `nextLine()`

👉 Always call:

```java
sc.nextLine();
```

to clear the input buffer.

---

## 💡 Summary

Mixing `nextInt()` and `nextLine()` without clearing the buffer causes unexpected empty string input.  
Always remember to manually consume the leftover newline.