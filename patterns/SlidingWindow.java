package patterns;

import java.util.Arrays;

class SlidingWindow {
    // Given an array, find the average of all contiguous subarrays of size K in it.
    // e.g avgSubArray([1,2,3,54,6,7,8,9,76], 4), = (1+2+3+54)/4
    static double naiveAvgSubArrays(int[] elements, int k) {
        // loop through all the elements
        // do another inner loop using the given size
        // sum all the elements within k
        // perform their average and store within the result array
        // if(k <= 0) return elements;
        int length = elements.length;

        double result = Double.NEGATIVE_INFINITY;

        if (length == 1)
            return elements[0];

        for (int i = 0; i <= length && i + k <= length; i++) {
            double tempSUm = 0;
            for (int j = i; j < i + k; j++) {
                tempSUm += elements[j];
            }
            double div = tempSUm / k;
            result = div > result ? div : result;
            tempSUm = 0;
        }
        return result;

    }

    static double windowAvgSubarr(int[] elements, int k) {
        double results = Double.NEGATIVE_INFINITY;

        int windowSum = 0;
        int windowStart = 0;
        for (int i = 0; i < elements.length; i++) {
            windowSum += elements[i];
            if (i >= k - 1) {
                double div = (double) windowSum / k;
                results = div > results ? div : results;

                windowSum -= elements[windowStart];
                windowStart++;
            }
        }
        return results;
    }

    static int naiveMaxSumSubArr(int[] arr, int k) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            result = sum > result ? sum : result;
        }
        return result;
    }

    static int windowMaxAvgSubarr(int[] elements, int k) {

        int windowSum = 0;
        int windowStart = 0;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            windowSum += elements[i];

            if (i >= k - 1) {
                result = windowSum > result ? windowSum : result;

                windowSum -= elements[windowStart];
                windowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] elements = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        System.out.println(naiveAvgSubArrays(elements, 5));
        System.out.println(windowAvgSubarr(elements, 5));
        System.out.println(naiveMaxSumSubArr(elements, 5));
        System.out.println(windowMaxAvgSubarr(elements, 5));
    }
}
