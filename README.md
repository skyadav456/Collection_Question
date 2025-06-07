# Collection_Question

# 🔥 Most Asked Java Collections Coding Interview Questions

These coding problems are frequently asked in interviews for Java Backend Developers (2–4 years experience). Focus is on Lists, Maps, Sets, Comparators, and practical coding challenges.

---

## ✅ List-Based Questions

### 1. Remove Duplicates from a List

* **Input**: `[1, 2, 2, 3, 4, 4]`
* **Output**: `[1, 2, 3, 4]`
* **Hint**: Use `LinkedHashSet` or Java 8 `Stream.distinct()`

### 2. Find Frequency of Each Element

* **Input**: `[1, 2, 2, 3, 1, 4]`
* **Output**: `{1=2, 2=2, 3=1, 4=1}`

### 3. First Non-Repeating Character in a String

* **Input**: `"swiss"`
* **Output**: `"w"`

### 4. Find Top K Frequent Elements

* **Input**: `[1,1,1,2,2,3], k = 2`
* **Output**: `[1, 2]`
* **Hint**: Use `HashMap` and `PriorityQueue`

---

## ✅ Map-Based Questions

### 5. Sort a Map by Values

* **Input**: `{John=5000, Jane=7000, Max=3000}`
* **Output**: `{Max=3000, John=5000, Jane=7000}`

### 6. Group Anagrams Together

* **Input**: `["bat", "tab", "cat", "act"]`
* **Output**: `[["bat", "tab"], ["cat", "act"]]`

### 7. Implement LRU Cache

* **Methods**: `get(int key)` and `put(int key, int value)`
* **Hint**: Use `LinkedHashMap`

---

## ✅ Object Sorting and Comparators

### 8. Sort List of Custom Objects

* **Requirement**: Sort `List<Employee>` by salary (desc), then by age (asc)
* **Hint**: Use `Comparator.comparing()` + `thenComparing()`

### 9. Sort Map by Keys in Descending Order

* **Hint**: Use `TreeMap` with custom comparator

---

## 🧠 Advanced / Real-World

### 10. Detect Cycle in Directed Graph

* **Input**: `Map<String, List<String>>`
* **Output**: `true` if cycle exists
* **Hint**: Use DFS with visited and recursion stack

### 11. ConcurrentModificationException Example

* Show example and fix using `Iterator` or `Concurrent Collections`

### 12. Convert List to Map Using Streams

* Convert `List<Employee>` to `Map<Integer, Employee>` using `Collectors.toMap()`

### 13. Intersection of Two Lists

* **Input**: `[1, 2, 3, 4]` and `[3, 4, 5]`
* **Output**: `[3, 4]`

### 14. Union and Difference of Two Sets

* Use `addAll()`, `retainAll()`, and `removeAll()`

### 15. Check If Two Maps Are Equal

* Use: `map1.equals(map2)`

---

## ✨ Bonus Questions for Practice

* Implement a custom `HashMap` class
* Find the most frequent word in a paragraph
* Sort a list using Java Streams
* Remove null values from a `Map`
* Merge two maps with key-wise value sum

