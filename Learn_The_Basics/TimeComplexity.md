# 📘 Time and Space Complexity  
(Striver A2Z DSA — Complete Notes)

---

# 🚀 What is Time Complexity?

Time complexity measures:

> How the running time of a program grows as input size (N) increases.

❌ It does NOT mean actual time in seconds.  
Different machines give different execution times.

Example:
- Old Windows PC → slower
- Latest MacBook → faster  
Same code, different time.

So we measure **growth rate**, not actual time.

---

# 📐 Formal Definition

Time Complexity =  
Rate at which execution time changes with respect to input size (N).

We represent it using:

# 🔵 Big O Notation

```
O(f(N))
```

It describes how performance scales as N increases.

---

# 🧠 Example: Simple Loop

```cpp
for(int i = 1; i <= 5; i++) {
    cout << "Raj";
}
```

Steps per iteration:
- comparison
- print
- increment

Runs 5 times → 5 × 3 = 15 steps  
Time complexity = O(15)

If it runs N times:
Steps = 3N  
Time Complexity = O(3N)

But we simplify it using rules 👇

---

# 📏 Rules to Calculate Time Complexity

## 1️⃣ Always Calculate Worst Case

We care about maximum possible time.

### Types:
- Best Case → minimum time
- Worst Case → maximum time
- Average Case → between both

In interviews → ALWAYS worst case.

---

## 2️⃣ Ignore Constants

Example:

```
O(3N + 1)
```

Remove constant:

```
O(3N)
```

---

## 3️⃣ Ignore Lower Order Terms

Example:

```
O(4N³ + 3N² + 8)
```

Step 1: Remove constant  
→ O(4N³ + 3N²)

Step 2: Keep highest power  
→ O(4N³)

Step 3: Remove coefficient  
→ O(N³)

✔ Final Answer: **O(N³)**

Because large N dominates smaller terms.

---

# 📊 Common Time Complexities

| Complexity | Name | Example |
|------------|-------|---------|
| O(1) | Constant | Access array element |
| O(log N) | Logarithmic | Binary Search |
| O(N) | Linear | Single loop |
| O(N log N) | Log Linear | Merge Sort |
| O(N²) | Quadratic | Nested loops |
| O(2^N) | Exponential | Recursion subsets |

---

# 🔍 Question 1: Nested Loops

```cpp
for(int i = 0; i < N; i++) {
    for(int j = 0; j < N; j++) {
        // constant work
    }
}
```

Outer loop → N  
Inner loop → N  

Total = N × N = N²  

Time Complexity = **O(N²)**

---

# 🔍 Question 2: Triangular Loop

```cpp
for(int i = 0; i < N; i++) {
    for(int j = 0; j <= i; j++) {
        // constant work
    }
}
```

Steps:

1 + 2 + 3 + ... + N  

Formula:

```
N(N+1)/2
```

= N²/2 + N/2  

Remove lower + constant →  

✔ **O(N²)**

---

# 🟣 Other Notations

Besides Big O:

| Notation | Meaning |
|----------|---------|
| Big O (O) | Worst Case |
| Theta (θ) | Average Case |
| Omega (Ω) | Best Case |

In interviews → focus mainly on Big O.

---

# 💾 What is Space Complexity?

Space complexity measures:

> Total memory used by program.

It includes:

```
Space = Auxiliary Space + Input Space
```

---

## 🧩 Example

```cpp
int a, b; // input space
int c = a + b; // auxiliary space
```

Total space = O(3) → O(1)

---

## 🧩 Example: Array

```cpp
int arr[N];
```

Space complexity = **O(N)**

---

# ⚠️ Important Interview Rule

Do NOT modify given input to reduce space.

Bad practice:
```
b = a + b;
```

Even if space reduces,
Never manipulate input unless interviewer allows.

Companies reuse data.  
So always keep input intact.

---

# 🏁 Competitive Programming Rule

Most online judges execute:

```
10^8 operations ≈ 1 second
```

So:

| Time Limit | Max Operations |
|------------|---------------|
| 1 sec | 10^8 |
| 2 sec | 2 × 10^8 |
| 5 sec | 5 × 10^8 |

If your solution is:

- O(N) → N can be 10^8
- O(N²) → N around 10^4
- O(N³) → N around 10^3

Rough estimation only.

---

# 🎯 Final Summary

Time Complexity:
- Measures growth of execution time
- Use Big O
- Worst case
- Ignore constants
- Ignore lower terms

Space Complexity:
- Measures memory used
- Includes auxiliary + input space
- Do not modify input unnecessarily

---

# 🧠 Golden Interview Line

"Time complexity measures how running time scales with input size, not actual time taken."

---

End of Notes 🚀
