# 📚 Day 01 – Linked List (Complete Notes)

---

## 🧠 1. What is a Linked List?

A Linked List is a **linear data structure** where elements are stored in **non-contiguous memory locations**.

Each element is called a **Node**.

Each Node contains:

* 📦 Data
* 🔗 Pointer (reference to next node)

```
[ DATA | NEXT ] → [ DATA | NEXT ] → NULL
```

---

## 🎯 Real Life Analogy

Think of a **Treasure Hunt 🏴‍☠️**:

* Each location has a clue to next location
* You can only move forward step-by-step

➡️ Same in Linked List → sequential access only

---

## ⚔️ 2. Array vs Linked List

| Feature       | Array      | Linked List    |
| ------------- | ---------- | -------------- |
| Memory        | Contiguous | Non-Contiguous |
| Size          | Fixed      | Dynamic        |
| Access        | O(1)       | O(n)           |
| Insert/Delete | Costly     | Efficient      |

---

## 🔗 3. Types of Linked List

1. **Singly Linked List (SLL)** ⭐
2. Doubly Linked List (DLL)
3. Circular Linked List (CLL)

---

## 🧱 4. Node Structure

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

📌 Each node stores:

* Value
* Address of next node

---

## 🔁 5. Traversal

To visit all nodes:

```java
Node temp = head;

while(temp != null) {
    temp = temp.next;
}
```

⚠️ Important:

* Never move `head`
* Always use `temp`

---

## ➕ 6. Insertion Operations

### 🔹 Insert at Beginning (O(1))

Steps:

1. Create new node
2. Point newNode → head
3. Move head to newNode

---

### 🔹 Insert at End (O(n))

Steps:

1. Traverse to last node
2. Attach new node

---

### 🔹 Insert at Position

Steps:

1. Reach (pos-1) node
2. Adjust links

---

## ❌ 7. Deletion Operations

### 🔹 Delete from Beginning

* Move head to next node

---

### 🔹 Delete from End

* Reach second last node
* Make next = null

---

### 🔹 Delete by Value

* Find node before target
* Skip target node

---

## 🔍 8. Searching

* Traverse list
* Compare each node

Time Complexity: O(n)

---

## 📏 9. Length of Linked List

* Traverse entire list
* Count nodes

---

## ⚠️ 10. Important Edge Cases

Always handle:

* Empty list (`head == null`)
* Single node
* Position out of bounds
* Value not found

---

## ⏱️ 11. Time Complexity

| Operation    | Time |
| ------------ | ---- |
| Insert Begin | O(1) |
| Insert End   | O(n) |
| Delete Begin | O(1) |
| Search       | O(n) |

---

## 🚨 12. Common Mistakes

❌ Moving `head` directly
❌ Wrong pointer update order
❌ Forgetting null checks

---

## 🧠 13. Key Learnings

✅ Linked List is dynamic
✅ Fast insertion/deletion
❌ Slow access (no indexing)

---

## 🎯 14. Interview Insights

👉 Use Linked List when:

* Frequent insert/delete
* Size unknown

👉 Avoid when:

* Need fast access
* Cache performance matters

---

## 📌 15. Summary

✔️ Understood Linked List basics
✔️ Implemented all operations
✔️ Learned edge cases
✔️ Practiced traversal & insertion

---

## 🚀 Status

✅ Day 01 Completed
🎯 Ready for Day 02 (DLL + CLL)
