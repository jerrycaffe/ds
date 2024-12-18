package com.patterns;


import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyCounter {
    /*
     * Write a function called sameSquared which accepts two arrays
     * The function should return true if every value in the first array has its corresponding value squared in the second array
     * The frequency of the values must be the same
     */

    public Boolean sameSquareNaive(List<Integer> firstArr, List<Integer> secondArray) {
        List<Integer> secondArr = new ArrayList<>(secondArray);
        if (firstArr.size() != secondArr.size()) return false;
        for (Integer element : firstArr) {
            var squared = element * element;
            if (secondArr.contains(squared)) {
                secondArr.remove(Integer.valueOf(squared));
            } else return false;
        }
        return true;
    }

    public Boolean sameSquared(List<Integer> firstArr, List<Integer> secondArr){
        if (firstArr.size() != secondArr.size()) return false;
        //iterate through first array,
        //check if the square of the current element exists as key within the hashmap, if it does increment the value else use the square of current element as key,
        // loop through the second array, check if the current element exist within the hashmap, if it does, check if the value is not zero. reduce the value by 1
        //else return false
        //return true at the end of the operations

        HashMap<Integer, Integer> mappedElement = new HashMap<>();
        for (Integer element: firstArr ){
            Integer squared = element * element;
            if(mappedElement.containsKey(squared)) mappedElement.put(squared, mappedElement.get(squared) + 1);
            else mappedElement.put(squared, 1);
        }
        for(Integer element: secondArr){
            if(mappedElement.containsKey(element) && mappedElement.get(element) != 0) mappedElement.put(element, mappedElement.get(element) -1);
            else return false;
        }
        return true;
    }
}
