Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.

To sort an array of size N in ascending order iterate over the array and compare the current element (key) to its predecessor, if the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

Consider an example: arr[]: {12, 11, 13, 5, 6}

Step 1

Initially, the first two elements of the array are compared in insertion sort.

Here, 12 is greater than 11 hence they are not in the ascending order. Thus, swap 11 and 12.
new array will be {11, 12, 13, 5, 6},

Step 2
Moving to the next element i.e 13 and 12

Here, 13 is greater than 12, thus both elements seems to be in ascending order, hence, no swapping will occur.
so sthe array still remain the same as before {11, 12, 13, 5, 6},

Step 3

Moving to the next element i.e 5 and 13
Here 5 is less than 13 Thus, swap 5 and 13 - new array will be {11, 12, 5, 13, 6}, - Since 5 is less than 12 again the swap continues until 5 is placed in the right order i.e - {11, 5, 12, 13, 6}, - Since 5 is less than 11 again the swap continues until 5 is placed in the right order i.e - {5, 11, 12, 13, 6},

Step 4
Moving to the next element i.e 6 and 13
Here 6 is less than 13 Thus, swap 6 and 13 - new array will be {5, 11, 12, 6, 13}, - Since 6 is less than 12 again the swap continues until 6 is placed in the right order i.e - {5, 11, 6, 12, 13}, - Since 6 is less than 11 again the swap continues until 6 is placed in the right order i.e - {5, 6, 11, 12, 13}, - Since 6 is now greater than the previous value there is no more swap which means 6 occupied the right position

Pseudocode
mark first element as sorted

for each unsorted element X

'extract' the element X

for j = lastSortedIndex down to 0

    if current element j > X

      move sorted element to the right by 1

    break loop and insert X here
