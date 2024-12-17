package com.patterns;


import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class FrequencyCounter {
    /*
     * Write a function called sameSquared which accepts two arrays
     * The function should return true if every value in the first array has its corresponding value squared in the second array
     * The frequency of the values must be the same
     */

    public Boolean sameSquareNaive(List<Integer> firstArr, List<Integer> secondArr) {

        if (firstArr.size() != secondArr.size()) return false;
        for (Integer element : firstArr) {
            var squared = element * element;
            if (secondArr.contains(squared)) {
                secondArr.remove(Integer.valueOf(squared));
            } else return false;
        }
        return true;
    }
}
