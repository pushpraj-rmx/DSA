# 01 — Arrays

An **array** is a fixed-size, contiguous collection of elements of the same type, accessed by index (starting at 0).

## Key ideas
- **Access by index:** `arr[i]` is O(1) — instant.
- **Fixed size:** in Java, the length is set at creation and can't change.
- **Search:** O(n) to find an element (unless sorted + binary search).
- **Insert/Delete in middle:** O(n) because elements must shift.

## Java basics
```java
int[] arr = new int[5];          // array of 5 ints, all 0
int[] nums = {3, 1, 4, 1, 5};    // initialized with values
nums.length;                     // size (a field, not a method!)
```

## Problems
Legend: ✅ Done · ⬜ Todo

| Status | Problem | File |
|--------|---------|------|
| ✅ | Find the maximum element | [`FindMax.java`](./FindMax.java) |
| ⬜ | Reverse an array in place | — |
| ⬜ | Find the sum of all elements | — |
| ⬜ | Check if array is sorted | — |
| ⬜ | Find second largest element | — |

## Notes
- Remember: array index out of bounds throws `ArrayIndexOutOfBoundsException`.
