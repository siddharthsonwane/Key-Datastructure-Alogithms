# Key Data Structure & Algorithm

A Java-based educational project focused on implementing essential data structures and algorithms from scratch.  
Ideal for students, developers, and interview preparation.

---

## 📦 Project Overview

This repository contains clean, modular implementations of core data structures and algorithms in Java.  
Each component is organized into packages for clarity and scalability.

---

## ✅ Currently Implemented

- Stack (using linked list)

---

## 🛠 Upcoming Implementations

- Queue (Linked List & Array-based)
- Singly & Doubly Linked Lists
- Trees (Binary, BST, etc.)
- Graphs (Adjacency List, BFS, DFS)
- Sorting Algorithms (Merge, Quick, etc.)
- Searching Algorithms (Binary Search, Linear Search)

---

## 📁 Project Structure

```plaintext
key-datastructure-algorithm/
├── stack/
│   ├── Node.java          # Node class for stack
│   ├── Stack.java         # Stack implementation
│   └── StackRunner.java   # Sample usage and testing

```
## 🧪 Sample Code

```java
Stack stack = new Stack(2);
stack.push(4);
stack.push(6);
stack.printStack();
stack.getTop();
stack.getHeight();
stack.pop();
stack.printStack();

```
## ✅ Sample Output:
```
 -----------------> printStack Method <------------------
2
-----------------> getTop Method <------------------
Top:2
-----------------> getHeight Method <------------------
Height : 1
-----------------> push Method <------------------
-----------------> push Method <------------------
-----------------> printStack Method <------------------
6
4
2
-----------------> getTop Method <------------------
Top:6
-----------------> getHeight Method <------------------
Height : 3
-----------------> pop Method <------------------
-----------------> printStack Method <------------------
4
2
```
## 📝 Explanation:
Initially the stack has 2

After pushing 4 and 6, the stack becomes: 6 -> 4 -> 2

After popping, 6 is removed, and the stack is now: 4 -> 2



## 🚀 Getting Started
Prerequisites
Java 8 or higher
Terminal or IDE (e.g., IntelliJ, Eclipse, VS Code)

## 📄 License
This project is open source and available under the MIT License.
See the LICENSE file for details.

## 👨‍💻 Author
Name : [Siddharth Sonawane]

GitHub: [https://github.com/siddharthsonwane]

LinkedIn: [https://www.linkedin.com/in/siddharthsonwane/]
