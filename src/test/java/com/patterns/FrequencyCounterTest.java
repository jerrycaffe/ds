package com.patterns;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {
    FrequencyCounter frequencyCounter = new FrequencyCounter();

    @Test
    public void testSameSquaredShouldFailWithUnequalInput(){
        var result = frequencyCounter.sameSquareNaive(List.of(1,3,4), List.of(1, 9, 16, 25));
        assertFalse(result);
    }

    @Test
    public void testSameSquareShouldFailUnbalancedSquare(){
        var result = frequencyCounter.sameSquareNaive(List.of(1,2,3), new ArrayList<>(List.of(1,4,6)));
        assertFalse(result);
    }

}