# Assignment 2

##### 1. What is Collection Framework? Explain the methods defined by collection interface.
- The Java Collections Framework standardizes the way in which groups of objects are handled by your programs.
- The framework had to be high-performance.
- The implementations for the fundamental collections(dynamic arrays, linked lists, trees, and hash tables) are highly efficient.
- The framework had to allow different types of collections to work in a similar manner and with a high degree of interoperability.
	```java
	// Syntax
	interface Collection<E>
	```
- ###### Methods in Collection interface
	* add()
		```java
		// Syntax
		boolean add(E obj)
		// Returns true if object is added to collection else false.
		```
	* addAll()
		```java
		boolean addAll(Collection<?> C)
		// Returns true is all elements of C are added to invoking collection, else false.
		```
	* clear()
		```java
		void clear()
		// clear all element from invoking collection
		```
	* contains()
		```java
		boolean contains(Object obj)
		// True if obj is an object of invoking collection.
		```
	* containsAll()
		```java
		boolean containsAll(Collection<?> C)
		// True if invoking collection contains all element of Collection<?>.
		```
	* equals()
		```java
		boolean equals(Object obj)
		// True if invoking collection is equal to object obj else false.
		```
	* hashcode()
		```java
		int hashcode()
		// Returns hashcode of invoking collection.
		```
	* isEmpty()
		```java
		boolean isEmpty()
		// Returns true if invoking collection is empty.
		```
	* iterator()
		```java
		iterator<E> iterator()
		// returns iterator for collection interface.
		```
	* remove()
		```java
		boolean remove(Object obj)
		// Returns true if an instance is successfully removed from invoking collection.
		```
	* removeAll()
		```java
		boolean removeAll(Collection<E> C)
		// Returns true if argument C is removed else false, from invoking collection.
		```
##### 2. Explain the constructors of HashSet class with an example program.

* HashSet extends AbstractSet.
* HashSet is generic class.
* Implements Set interface.
* Creates collection that uses hash table for storage.
* Important points
	> Element stored using hashing mechanism.
	> Contains only unique element
	```java
	// Declaration
	class HashSet<E>
	// E -> type of object that set will hold
	```
	```java
	// Constructors
	HashSet()
	HashSet(Collection<? extends E> C)
	HashSet(int capacity)
	HashSet(int capacity, float fillRatio)
	```
* Example Program
	```java
	import java.util.*;
	class HashSetDemo {
		public static void main(String args[]) {
			HashSet<String> hs = new HashSet<String>();
			hs.add("B");
			hs.add("A");
			hs.add("D");
			System.out.println(hs);
		}
	}
	// Output -> [B, A, D]
	```

##### 3. Explain the following collection interfaces:

###### List

* Way to store ordered collection.
* Allows positional access and insertion of elements.
	```java
	// Declaration
	public interface List<E> extends Collection<E>;
	// Example
	List<obj> list = new ArrayList<obj>();
	// obj - type of object to be stored in list.
	```

###### Set

* It extends Collection and declares the behaviour of a collection that does not allow duplicate elements.
* Set is a generic interface
* add() method returns false if an attempt, for duplicate elements.
	```java
	// Declaration
	interface Set<E>
	```
###### SortedSet

* The SortedSet interface extends Set and declares the behavior of a set sorted in ascending order.
* SortedSet is a generic interface
	```java
	// Declaration
	interface SortedSet<E>
	```
###### Queue
* Queue interface extends Collection and declares the behaviour of a queue.
* General Behavior - first-in, first-out list.
*  However, there are types of queues in which the ordering is based upon other criteria. 
*  Queue is a generic interface.
	```java
	// Declaration
	interface Queue<E>
	```

##### 4. Demonstrate ArrayList class for collections with an example.
* ArrayList Implements a dynamic array by extending AbstractList.
* ArrayList class extends AbstractList and implements the List interface
* ArrayList is a generic class
	```java
	// Declaration
	class ArrayList<E>
	```
	```java
	// Constructors
	ArrayList() // constructor builds an empty array list
	ArrayList(Collection<? extends E> C) // builds an array list that is initialized with the elements of the collection c.
	ArrayList(int capacity)
	// builds an array list that has the specified initial capacity. The capacity is the size of the underlying array that is used to store the elements. The capacity grows automatically as elements are added to an array list.
	```
* Example Program
	```java
	import java.util.*;
	class ArrayListDemo {
		public static void main(String args[]) {
			ArrayList<String> al = new ArrayList<String>(); 
			System.out.println("Initial size of al: " + al.size());
			al.add("C");
			al.add("A");
			al.add("E");
			al.add("B");
			al.add("D");
			al.add("F");
			al.add(1, "A2");
			System.out.println("Size of al after additions: " + al.size());
			System.out.println("Contents of al: " + al); al.remove("F");
			al.remove(2);
			System.out.println("Size of al after deletions: " +al.size()); 
			// Output
			// Initial size of al: 0
			// Size of al after additions: 7
			// Contents of al: [C, A2, A, E, B, D, F]
			// Size of al after deletions: 5
		}
	}
	```

##### 5. Explain the following Map classes: i)HashMap ii)TreeMap
###### HashMap
* The HashMap class extends AbstractMap and implements the Map interface. 
* It uses a hash table to store the map.
* This allows the execution time of get() and put() to remain constant even for large sets. 
* HashMap is a generic class.
	```java
	// Declaration
	class HashMap<K, V>
	// K -> Type of key & V -> Type of values
	```
	```java
	// Constructors
	HashMap()
	HashMap(Map<? extends K, ? extends V> m)
	HashMap(int capacity)
	HashMap(int capacity, float fillRatio)
	```
* The first form constructs a default hash map. The second form initializes the hash map by using the elements of m. The third form initializes the capacity of the hash map to capacity. The fourth form initializes both the capacity and fill ratio of the hash map by using its arguments. The meaning of capacity and fill ratio is the same as for HashSet, described earlier. The default capacity is 16. The default fill ratio is 0.75.

###### TreeMap
* The TreeMap class extends AbstractMap and implements the NavigableMap interface.
* It creates maps stored in a tree structure.
* A TreeMap provides an efficient means of storing key/value pairs in sorted order and allows rapid retrieval. 
* Unlike a hash map, a tree map guarantees that its elements will be sorted in ascending key order.
* TreeMap is generic class.
	```java
	// Declaration
	class TreeMap<K, V>
	// K -> Type of key & V -> Type of values
	```
	```java
	// Constructors
	TreeMap()
	TreeMap(Comparator<? super K> comp)
	TreeMap(Map<? extends K, ? extends V> m)
	TreeMap(SortedMap<K, ? extends V> sm)
	```
