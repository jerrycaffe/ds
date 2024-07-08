consider the following array as an example: arr[] = {64, 25, 12, 22, 11}

First Move
-> The first position (index 0) in the array, will be assumed to be the least element in the array
The whole array is traversed from index 0 to the last index i.e 4, sequentially to locate any element smaller than the value in index 0. i.e 64

-> On Getting to the end of the array we discovered that 11 is the smallest value which occupies index 4, so we swap 64 which is the first element and currently at index 0 to be in the position where 11 is found.
The current array looks like {11, 25, 12, 22, 64}

Move the pointer forward to the next index in the array

Second Move
-> The second position (index 1) in the array, will be assumed to be the new least element in the array
-> The whole array is traversed from index 1 to the last index i.e 4, sequentially to locate any element smaller than the value in index 1. i.e 25
-> After traversing, we found that 12 is the next smallest value in the array then we swap 12 with 25
The current array looks like {11, 12, 25, 22, 64}

Move the pointer forward to the next index in the array

Third Move
-> The third position (index 2) in the array, will be assumed to be the new least element in the array
-> The whole array is traversed from index 2 to the last index i.e 4, sequentially to locate any element smaller than the value in index 2. i.e 25
-> After traversing, we found that 22 is the next smallest value in the array then we swap 22 with 25
The current array looks like {11, 12, 22, 25, 64}

Fourth Move
-> The third position (index 3) in the array, will be assumed to be the new least element in the array
-> The whole array is traversed from index 3 to the last index i.e 4, sequentially to locate any element smaller than the value in index 3. i.e 25
-> After traversing, we found that 25 is still smallest value in the array then we do not swap
The current array looks like {11, 12, 22, 25, 64}

<!-- we do not need to bother about the last element in the array because comparisom has been made between 25 and 64 -->
