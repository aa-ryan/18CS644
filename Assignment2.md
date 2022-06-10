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
* The first form constructs an empty tree map that will be sorted by using the natural order of its keys. The second form constructs an empty tree-based map that will be sorted by using the Comparator comp. The third form initializes a tree map with the entries from m, which will be sorted by using the natural order of the keys. The fourth form initializes a tree map with the entries from sm, which will be sorted in the same order as sm.

##### 6. What is String in Java? Write a java program that demonstrate any four constructors of String class.
* String is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.
	```java
	 class StringConstructors
	 {
			public static void main(String[] args)
		 {
			   char[] charArray ={'Y', 'A', 'M', 'E', 'T', 'E'};
			   byte[] ascii ={65,66,67,68,70,71,73};
			   // Type 1 -> String object
			   String strO =new String("Java");
			   // Type 2 -> From character array
			   String strC =new String(charArray);
			   // Type 3 -> From Byte Array
			   String strA =new String(ascii);
			   // Type 4 -> Empty string intialization
			   String strE =new String();

			   System.out.println("StrO : "+ strO);
			   System.out.println("StrC : "+ strC);
			   System.out.println("Str4 : "+ strA);
			   System.out.println("Str6 : "+ strE);
           // Output
           // StrO : Java
           // StrC : YAMETE
           // Str4 : ABCDFGI
           // Str6 :
		 }
	 }
	```
##### 7a. Difference between equals() and == with respect to String comparison.
| I | Key         | ==                                                                                                          | equals() method                                                                                                     |
|---|-------------|-------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| 1 | Type        | == is an operator.                                                                                          | equals() is a method of Object class.                                                                               |
| 2 | Comparision | == should be used during reference comparison. <br>== checks if both references points to same location or not. | equals() method should be used for content comparison. <br>equals() method evaluates the content to check the equality. |
| 3 | Object      | == operator can not be overriden.                                                                           | equals() method if not present and Object.equals() method is utilized, otherwise it can be overridden.              |

* Example Program
```java
class DilemmaEQ {
   public static void main(String args[]) {
      String s1 = new String("REF-COMP");
      String s2 = new String("REF-COMP");
      // Reference comparison
      System.out.println(s1 == s2);
      // Content comparison
      System.out.println(s1.equals(s2));
      // char-type
      System.out.println('a' == 'a');
      // Output
      // false
      // true
      // true
   }
}

```

##### 7b. Explain any two character extraction methods of String class.
* The String class provides a number of ways in which characters can be extracted from a String object. String object can not be indexed as if they were a character array, many of the String methods employ an index (or offset) into the string for their operation. Like arrays, the string indexes begin at zero.
	- charAt()
	```java
	// To extract a single character from a String, you can refer directly to an individual character via the charAt( ) method.
 	char charAt(int index) 
	// returns character specified at the location.
	char ch;
	ch = "abc".charAt(1);
	```
	- getChars()
	```java
	// To extract more than one character at a time
	void getChars(int indexStart, int indexEnd, char target[], int targetStart)
	// Example
	String s = "Kuiasad"
	int start = 1, end = 4;
	char buf[] = new char[end - start];
	s.getChars(start, end, buf, 0);
	System.out.println(buf);
	```

##### 8. Explain any four String modification methods of String class.
* String objects are immutable, whenever you want to modify a String, you must either copy it into a StringBuffer or StringBuilder, or use one of the following String methods, which will construct a new copy of the string with modifications.
	* Substring()
		- You can extract a substring using Substring().
		```java
		// Two types/forms
		String substring(int startIndex) // runs to the last of string.
		String substring(int startIndex, endIndex) // runs within indexes.
		```
		```java
		String s = "hello";
		System.out.println(s.substring(0,2))
		// Output -> he
		```
	* concat()
		- Concatenates two strings.
		- This method creates a new object that contains the invoking string with the contents of str appended to the end.
		```java
		// Method 
		String concat(String str)
		```
		```java
		String s1 = "one";
		String s2 = s1.concat("two");
		// Output -> onetwo
		```
	* replace()
		- replaces all occurrences of one character or sequence in the invoking string with another character.
		```java
		String replace(char original, char replacement)
		String replace(CharSequence original, CharSequence replacement)
		```
		```java
		String s = "Hello".replace('l', 'w');
		System.out.println(s);
		// Output  -> Hewwo
		```
	* trim()
		- trim() method returns a copy of the invoking string from which any leading and trailing whitespace has been removed.
		```java
		String trim()
		```
		```java
		String s = " Hello World  ".trim()
		// "Hello World"  as whitespace omitted/trimmed
		```
##### 9. Explain the following methods of StringBuffer class
##### append()
* The append() method concatenates the string representation of any other type of data to the end of the invoking StringBuffer objectA
* The result is appended to the current StringBuffer object.
* The buffer itself is returned by each version of append( ).
* This allows subsequent calls to be chained together, as shown in the following example:
	```java
	class appendDemo {
		public static void main(String args[])
		{ 
			String s; 
			int a = 42;
			StringBuffer sb = new StringBuffer(40);
			s = sb.append("a = ").append(a).append("!").toString();
			System.out.println(s);
		}
	}
		// Output
		// a = 42!
	```
###### insert()
* The insert() method inserts one string in to another.
* It is overloaded to accept values of all the simple types, plus Strings, Objects, and CharSequences.
* Like append(),it calls String.valueOf() to obtain the string representation of the value it is called with.
* This string is then inserted into the invoking StringBuffer object.
	```java
	class insertDemo { 
		public static void main(String args[]) {
			StringBuffer sb = new StringBuffer("I Java!");
			sb.insert(2, "like ");
			System.out.println(sb);
		}
	}
	 // Output -> I like Java!
	```
###### reverse()
* Reversal of string.
* This method returns the reversed object on which it was called.
```java
class ReverseDemo {
	public static void main(String args[])
	{ 
		StringBuffer s = new StringBuffer("abcdef"); 
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
	// Output
	// abcdef
	// fedcba
```
##### replace()
* Replace one set of characters with another set inside a StringBuffer object
```java
	class replaceDemo {
	public static void main(String args[])
	{ 
		StringBuffer sb = new StringBuffer("This is a test.");
		sb.replace(5, 7, "was");
		System.out.println("After replace: " + sb);
	}
}
	//Output
	// After replace: This was a test.
```
##### 11. How compareTo() method differs from compareToIgnoreCase() method? Write a Java program to sort an array of string in descending order by ignore the case.
* The String compareToIgnoreCase() method in Java is used to compare two strings lexicographically by ignoring the case of both strings. The strings are compared on the basis of the Unicode value of characters in both strings, after converting the characters to lowercase.
* Both the compareToIgnoreCase() and compareTo() methods compare two strings lexicographically. The only difference is that unlike the compareTo() method, the case of the strings being compared is ignored by the compareToIgnoreCase() method.

```java
import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<String> {
  public int compare(String strA, String strB) {
    return strA.compareToIgnoreCase(strB);
  }
}

class Main {
  public static void main(String[] argv) throws Exception {
    String strs[] = { "a", "A", "b", "C", "d"};

    MyComparator icc = new MyComparator();

    Arrays.sort(strs, icc.reversed());

    for (String s : strs) {
      System.out.print(s + " ");
    }
    System.out.println();
    Arrays.sort(strs);

    System.out.print("Default, case-sensitive sorted order: ");
    for (String s : strs) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
```
