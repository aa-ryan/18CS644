## Type Wrappers

### Fundamentals

* A Wrapper class is a class whose object wraps or contains primitive data types.
* In other words, we can wrap a primitive value into a wrapper class object.

* Need of Wrapper Classes
	- Conversion of primitive data types into objects.
		> Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
	- The classes in java.util package handles only objects and hence wrapper classes help in this case also.
	- Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
	- An object is needed to support synchronization in multithreading.

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| char                | Character     |
| byte                | Byte          |
| short               | Short         |
| int                 | Integer       |
| long                | Long          |
| float               | Float         |
| double              | Double        |
| boolean             | Boolean       |

### Autoboxing

* Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double.
