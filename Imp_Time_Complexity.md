# 📊 Time Complexity Order (Fastest → Slowest)

When comparing algorithms, smaller growth rate = faster algorithm.

Important:
As N becomes very large, the growth rate matters most.

---

# 🟢 FASTEST → SLOWEST ORDER

```
O(1)
<
O(log N)
<
O(√N)
<
O(N)
<
O(N log N)
<
O(N²)
<
O(N³)
<
O(2^N)
<
O(N!)
```

Top = Best  
Bottom = Worst  

---

# 🧠 Easy Memory Trick

Think of it like levels:

Level 1 → Constant  
Level 2 → Logarithmic  
Level 3 → Linear  
Level 4 → Polynomial  
Level 5 → Exponential  
Level 6 → Factorial (Worst)

---

# 🔎 Quick Explanation

## 🟢 O(1) — Constant (Fastest)
Time does not depend on input size.

Example:
```
arr[5]
```

Even if N = 1 million → still 1 step.

---

## 🟢 O(log N) — Very Fast
Example: Binary Search

If N = 1,000,000  
log₂(1,000,000) ≈ 20  

Only ~20 steps 😮

---

## 🟡 O(N)
Linear growth.

If N doubles → time doubles.

Example:
Single loop

---

## 🟡 O(N log N)
Slightly slower than linear.

Used in:
- Merge Sort
- Quick Sort (average case)

---

## 🔴 O(N²)
Nested loops.

If N = 1000 → 1,000,000 operations

---

## 🔴 O(N³)
Triple nested loops.

Becomes slow very quickly.

---

## 🚨 O(2^N)
Exponential.

Very dangerous.

If N = 20 → over 1 million operations.

Used in:
- Subset generation
- Naive recursion

---

## 💀 O(N!)
Worst of all.

If N = 10 → 36,28,800 operations.

Used in:
- Permutations

---

# 🎯 Interview Comparison Examples

Which is faster?

O(N) vs O(N log N)  
✔ O(N) is faster

O(N²) vs O(2^N)  
✔ O(N²) is faster

O(log N) vs O(√N)  
✔ O(log N) is faster

O(N log N) vs O(N²)  
✔ O(N log N) is faster

---

# 🔥 Very Important Rule

For large N:

Ignore constants and lower powers.

Example:
O(100N) = O(N)  
O(N² + N) = O(N²)

Only highest growth matters.

---

# 🧠 Ultimate Shortcut

Smaller growth = Faster  
Higher growth = Slower  

Just remember this chain:

```
1 → log N → N → N log N → N² → N³ → 2^N → N!
```

Say it 5 times. It will stick forever.

---

End of Big-O Order Notes 🚀
