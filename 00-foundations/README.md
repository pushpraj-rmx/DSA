# 00 - Foundations

The absolute basics, before any specific topic.

## What is DSA?
- **Data Structure** = a way to *store* data (the container).
- **Algorithm** = a set of *steps* to solve a problem using that data.

## What is an array?
A numbered row of boxes, all holding the same type of value.

```
Index:    0     1     2     3     4
        +-----+-----+-----+-----+-----+
Value:  |  3  |  7  |  2  |  9  |  4  |
        +-----+-----+-----+-----+-----+
```

Rules to remember:
1. Indexes start at **0**, not 1. First element is `arr[0]`.
2. Accessing by index is instant: `arr[3]` gives `9`.
3. Size is **fixed** at creation time.

## The shape of a Java program
Every Java program lives inside a `class`, and starts running from `main`:

```java
public class Hello {                 // a class named Hello
    public static void main(String[] args) {   // where the program starts
        System.out.println("Hi");    // print a line of text
    }
}
```

- The **file name must match the class name**: `Hello.java` holds `class Hello`.
- `System.out.println(...)` prints something and moves to a new line.

## Big O (just the idea, for now)
Big O is how we describe **how slow an algorithm gets as data grows**.
- **O(1)** = constant. Instant, no matter the size. (e.g. `arr[3]`)
- **O(n)** = linear. Looking at every element once. (e.g. finding the max)

We'll build deeper intuition as we go. Don't stress about it yet.
