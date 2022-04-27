# Enumerations 
### Fundamentals
* Enumerations serve the purpose of representing a group of named constants in a programming language.
* Enumerations is created using "enum" keyword.
 ```java
 enum Apple {
 	Jonathan, GoldenDel, RedDel, Winesap, Cortland
		^-----------^--------^---Enumerations Constants
 }
 ```

 * Enumerations constants, each is implicitly declared as public, static final memeber of Apple.
 * Their type is the type of the enumeration in which they are declared, which is Apple in this case. Thus, in the language of Java, these constants are called self-typed, in which “self” refers to the enclosing enumeration.
 
 ```java
	 Apple ap; // Declaration
	 ap = Apple.RedDel
	 // do not instantiate an "enum" using "new", 
	 // same way as primitive types.
 ```

 * Example Program 1 - enum1.java

### The values() and valueOf() Methods

* The values() method returns an array that contains a list of the enumeration constants. 
* The valueOf() method returns the enumeration constant whose value corresponds to the string passed in str.
* Example Program 2 - enum2.java


### Java Enumerations are Class Types

* enum defines a class gives the Java enumeration extraordinary power. For example, you can give them constructors, add instance variables and methods, and even implement interfaces.
* It is important to understand that each enumeration constant is an object of its enumeration type.
* Example Program 3 - enum3.java
* Two Restrictions:
	- an enumeration can’t inherit another class
	- an enum cannot be a superclass. This means that an enum can’t be extended. 
* Otherwise, enum acts much like any other class type

### Enumerations inherit Enum

* Although you can’t inherit a superclass when declaring an enum, all enumerations automatically inherit one: java.lang.Enum. 
* This class defines several methods that are available for use by all enumerations
* Obtain enumeration constant position in the list of constants, this is called ordinal value and is retrieved by calling ordinal() method.

```java
final int ordinal()
```

* You can compare the ordinal value of two constants of the same enumeration by using the compareTo( ) method.
```java
final int compareTo(enum-type e)
```
* Here, enum-type is the type of the enumeration, and e is the constant being compared to the invoking constant. 
* Remember, both the invoking constant and e must be of the same enumeration. 
* If the invoking constant has an ordinal value less than e’s, then compareTo() returns a negative value. If the two ordinal values are the same, then zero is returned. If the invoking constant has an ordinal value greater than e’s, then a positive value is returned.
* equals() can compare an enumeration constant to any other object, those two objects will be equal only if they both refer to the same constant, within the same enumeration
* Example Program - enum4.java
