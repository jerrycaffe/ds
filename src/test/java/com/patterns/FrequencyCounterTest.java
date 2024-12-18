package com.patterns;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {
    FrequencyCounter frequencyCounter = new FrequencyCounter();


    @Test
    public void testSameSquaredShouldFailWithUnequalInput(){
        var firstArr = List.of(1,3,4);
        var secondArr = List.of(1, 9, 16, 25);
        var naiveResult = frequencyCounter.sameSquareNaive(firstArr, secondArr);
        var realResult = frequencyCounter.sameSquared(firstArr, secondArr);
        assertFalse(naiveResult);
        assertFalse(realResult);
    }


    @Test
    public void testSameSquareShouldFailUnbalancedSquare(){
        var firstArr = List.of(1,2,3);
        var secondArr = new ArrayList<>(List.of(1,4,6));
        var naiveResult = frequencyCounter.sameSquareNaive(firstArr, secondArr);
        var realResult = frequencyCounter.sameSquared(firstArr, secondArr);
        assertFalse(naiveResult);
        assertFalse(realResult);
    }
    @Test
    public void testShouldPassOnCorrectInput(){
        var firstArr = List.of(2,3,6,8,8);
        var secondArr = new ArrayList<>(List.of(64, 36, 4, 9, 64));
        var naiveResult = frequencyCounter.sameSquareNaive(firstArr, secondArr);
        var realResult = frequencyCounter.sameSquared(firstArr, secondArr);
        assertTrue(naiveResult);
        assertTrue(realResult);
    }

}