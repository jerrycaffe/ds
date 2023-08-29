String is an array of characters i.e an Array of Strings work exactly like Java String. e.g

`char[] str = {'j','e','r','r','y'};
String s = new String(str);
//Result is jerry and this is the same as 
String s = "jerry";
`

Java String has methods like operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.

We can crate Strings in java using either String, StringBuffer and StringBuilder because they are all implementing the CharSequence interfaces

The Java String is immutable which means it cannot be changed.
Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.

Other Reasons String is not mutable in java

1. ClassLoader
   if the String object is modifiable, the value might be changed and the class that is supposed to be loaded might be different
2. Thread Safe
   we don't have to take care of the synchronization that is required while sharing an object across multiple threads.
3. Security
   Consider an example of banking software. The username and password cannot be modified by any intruder because String objects are immutable

4. Heap Space
   The immutability of String helps to minimize the usage in the heap memory. When we try to declare a new String object, the JVM checks whether the value already exists in the String pool or not. If it exists, the same value is assigned to the new object. This feature allows Java to use the heap space efficiently

For mutable strings, you can use StringBuffer and StringBuilder classes.

2 ways of creating Strings in java

1. String literal e.g String s = "Jerry"
2. new keyword

3 ways to compare String java

1. Using equals() Method: The String class equals() method compares the original content of the string can be acheived with either equals method or equalsIgnoreCase() which both returns a bollean value
2. Using == Operator: The == operator compares references not values
3. compareTo() Method: compares values lexicographically and returns an integer value, 0 if equal, positive value if a > b and negative value if a < b.

In Java, String concatenation forms a new String that is the combination of multiple strings.
String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method.
2 ways of concatenating

1. using + operator: String concatenation operator produces a new String by appending the second operand onto the end of the first operand
2. Using concat() method:

Substring in Java
A part of String is called substring. In other words, substring is a subset of another String.
