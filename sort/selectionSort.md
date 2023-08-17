consider the following array as an example: arr[] = {64, 25, 12, 22, 11}

<!-- Note here in Java we have two options.
1. Either to create a new array
2. modify the array given by creating a copy to be returned
 -->

First Move
The first position (index 0) in the array, will be assumed to be the least element
The whole array is traversed from index 0 to 4 sequentially to locate any element smaller than index 0 i.e 64
Getting to the end of the array to discover that 11 is the smallest, swap 64 to be in the position of 11 and 11 to be in the position of index 0, i.e 64
Move the pointer forward to the next index in the array

Second Move
For the second position, where 25 is present, traverse the rest of the array in a sequential manner comparing each element with 25 for the least.
After traversing, we found that 12 is the next smallest value in the array then swap 12 with 25
Move the pointer forward to the next index in the array

Third Move
For the third position, 25 is present again traverse the rest of the array and find the third least value present in the array
Continue until the pointer gets to the end of the array
