# Hashmaps

## What is hashing?

Hashing is a technique used in computer science to efficiently store and retrieve data. It involves using a hash function
to convert data (such as strings or numbers) into fixed-size values called hash codes or digests. These hash codes are 
used as indexes to store the data in data structures like hash maps, hash tables, and hash sets. Hashing is quite useful
for storing and retrieving data quickly and efficiently.

### Key properties of hash functions:

- **Deterministic**: A hash function must consistently produce the same output for the same input. Even a minor change 
  in input produces a radically different hash, giving it sensitivity to data changes
- **Fixed Output Size**: The output of a hash function should have a fixed size, regardless of the size of the input.
- **Pre-image Resistance**: It should be computationally infeasible to reverse the hash function, i.e., to find the 
   original input given a hash value.
- **Collision Resistance**: It should be difficult to find two different inputs that produce the same hash value.

### Why is hashing an **efficient method for data retrieval?**

- **Database lookup** - A good hash function uniformly distributes keys across the hash table, allowing for a more 
   balanced and efficient data retrieval
- **Data integrity** - When data is being transferred over a network, it is susceptible to loss of packets 
  or malicious interference, so if two hashes are compared and are identical, it allows a system to 
  verify the integrity of data. This is because the same data hashed by the same hashing function 
  will produce the same digest

## HashMaps

In Java, **HashMap** is part of the **Java Collections Framework** and is found in the **java.util** package. It 
provides the basic implementation of the **Map interface** in Java. HashMap stores data in **(key, value)** pairs. 
Each key is associated with a value, and you can access the value by using the corresponding key. Key-value pairs are 
stored in what is known as buckets which together make up what is called a table, which is actually an internal array. 
Using a Hash Map is ideal for scenarios where fast retrieval, insertion, and deletion of elements are required because 
we can search, add, modify, and remove entries quickly and efficiently. The advantage of a HashMap is that the time 
complexity to insert and retrieve a value is *O(1)* on average compared to O(n) in an array.



**Key Features**

- **Fast Performance** - HashMaps use a technique called hashing to store the keys. This gives it fast access times for 
  lookups, insertions and deletions with the average time complexity being O(1).
- **Unordered Collection -** HashMap does not maintain any order for its entries. To maintain insertion order of 
  keys, you can use LinkedHashMap, which keeps the order in which entries were added.
- **Allows Null Values -** It permits one null key and multiple null values.
- **Non-Synchronised -** HashMap is not synchronised by default and thus is not thread-safe. For concurrent access
  (multiple threads need to access it concurrently), ConcurrentHashMap is recommended for thread safety.

## HashMap performance

The performance of a hash map is affected by two parameters: 

- **Initial Capacity** -  this is the number of buckets in the hashmap or the underlying array length and the initial 
  capacity is simply the capacity at the time the hashmap is created. The default initial capacity is *16*. As the number
  of elements in the 
  HashMap increases, the capacity is expanded.
- **Load Factor -**  The loaf factor represents how full the hashmap and is the measure that decides when to resize to 
  increase the capacity of the hashmap. The default load factor is *0.75*. It's essentially a threshold represented by the ratio fo the number of elements / the 
  initial capacity. If this ratio crosses the threshold then the capacity increases so that the operational complexity 
  of the hashmap remains O(1). The lower the load factor, the more free buckets available. When the threshold is crossed
  the capacity of the map is increased. When the capacity is increased we need to equally distribute all the entries 
  across all the buckets. In this case we need to use rehashing to calculate the hash code again for each existing key-value
  pair again with the increased capacity as a parameter.

the default values for initial capacity and load factor are optimised for most cases but you can set your own custom 
values. However, this may have implication for the performance so they must be picked wisely.

## Collisions

A collision, or more specifically, a hash code collision in a HashMap, is a situation where two or more key objects 
produce the same final hash value and hence point to the same bucket location or array index. It’s the hash value of the
key that determines the bucket the object will be stored in. And so, if the hash codes of any two keys collide, their 
entries will still be stored in the same bucket. This is called a collision. This is a problem because If not handled 
correctly, you won’t be able to tell the values apart, and retrieving data could become slower or even incorrect.

### How to handle collisions?

1. **Separate Chaining** - This is the most common way to handle collisions. When multiple keys end up in the same bucket,
  we create a **linked list**(or another data structure) inside that bucket to store all the key-value pairs.

   How it works:

    - If two keys end up in the same bucket, instead of replacing the old key-value pair, a new entry is added to
      the list.
    - When you want to retrieve data, the HashMap will check the bucket and look through the linked list to find the 
     right key.

   Separate Chaining is easy to implement and works well when the table is sparse (few collisions). However, as 
   collisions increase, the linked lists can get long, slowing down the retrieval process. This presents a worst case 
   scenario where the potential O(1) time complexity is transformed into O(n) for retrieval.

2. **Open Addressing** - In this method, instead of storing multiple keys in the same bucket, the HashMap tries to find 
  an empty bucket. If a collision happens, the HashMap looks for the next available space to store the key-value pair.

   There are a few strategies for finding the next bucket:

    - **Linear Probing**: Start from the bucket that caused the collision and check each subsequent bucket until an 
      empty one is found. Linear probing is simple and easy to implement but can lead to clustering (a situation where 
      keys are stored in long contiguous runs), which leads to decreased performance.
    - **Quadratic Probing**: Instead of checking the next bucket, this method checks buckets further away based on a 
      quadratic formula. Although it can result in reduced clustering compared to linear probing, resulting in better 
      average-case performance, it’s prone to secondary clustering, although less severe than primary clustering.
    - **Double Hashing**: This uses another hash function to calculate a new position when a collision happens. This 
      method significantly reduces both primary and secondary clustering but it can slightly more complex to implement 
      as it requires two well designed hash functions.

   Open Addressing saves space since it doesn’t require extra data structures like linked lists. But it can become 
   inefficient when the HashMap is nearly full because it has to probe a lot of buckets to find an empty one.


## Time & space complexity - worst & average case

| **Operation** | **Average case** | **Worst case** |
| --- |------------------| --- |
| Insertion | O(1)             | O(n) |
| Lookup | O(1)             | O(n) |
| Deletion | O(1)             | O(n) |

###Why O(1) in Average Case?
- **Uniform Distribution**: A good hash function distributes keys uniformly across the buckets, minimizing collisions.
- **Load Factor**: HashMap maintains a load factor (default 0.75), which ensures that the map is resized when it reaches a 
certain threshold, keeping the number of elements in each bucket low.
- **Resizing**: When the load factor threshold is exceeded, the HashMap is resized (doubled in size), and entries are 
  rehashed to new buckets, which helps maintain constant time complexity.

###Why O(n) in Worst Case?

- **Poor Hash Function**: If the hash function is poor, it might cause many keys to hash to the same bucket, resulting 
  in a long linked list or a deeply nested tree.
- **No Resizing**: If resizing is disabled or not done appropriately, the HashMap may end up with many entries in the same bucket.
- **Collisions**: High collision scenarios lead to longer chains or deeper trees, causing the time complexity to degrade
  to O(n) as each key needs to be compared sequentially.