Arrays hold values of the same type at contiguous memory locations
The word contiguous means they are next to each other.

2 major things get us bothered in arrays especially in java
1. position of the element usually known as index
2. the value itself i.e the element

In some languages like Python, JavaScript, Ruby, PHP, the array (or list in Python) size is dynamic and you do not need to have a size defined beforehand when creating the array. But in Java it is very important one define the array size

Why do we use array
1. Almost all programming languages have it built in
2. store multiple elements of the same type with a single variable name
3. accessing elemnts is fast so far you know the index unlke linked list that traverses from the beginning

Problem with array
1. Adding and removing elements from middle is slow because of reindexing meaning the index of each elements changes again and they are reassigned by the compiler
2. In java the sizes are fixed
Java arrays
1. Declaration
elementDataType[] arrayName;
e.g int[] intItems;
OR
elemenetDataType arrayName[];
e.g int intItems[];

2. Constructing an Array
arrayName = new elementDataType[arraySize];
e.g intItems = new int[3];

3. Initialize an Array
dataType arrayName[] = {arrayValues separated with commas}
e.g int intItems[] = {2,3,4,5,67,3,56,3,5}
Further reading
   array questions and string questions are often interchangeable