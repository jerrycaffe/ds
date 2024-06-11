package src.main.java.com.ds.patterns.frequenCounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    static int majorityElement(int[] nums) {
        // 2,5,6,6,6,6,7,8,9,10
        // Sort the given values
        // create three variables to store the highest number and to store the number of
        // occurrence
        // [1,1,1,2,2,2,2]
        // loop through

        // once done with counting check prev value is higher than the currrent value
        Arrays.sort(nums);

        int valueCount = nums[0];
        int highestCount = 1;

        int currentCount = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) {
                currentCount++;
            } else {
                if (currentCount > highestCount) {
                    highestCount = currentCount;
                    valueCount = nums[i - 1];

                }
                currentCount = 1;
            }

            if (i == nums.length - 1 && currentCount > highestCount) {
                highestCount = currentCount;
                valueCount = nums[i];
            }

        }

        return valueCount;
    }

    static int majorityElementFreqCounter(int[] nums) {
        // create map
        // iterate through the element and check if the value exists, if yes increment
        // value else add it to the map
        // iterate through the map to discover the highest number
        // return the highest number

        Map<Integer, Integer> allNums = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer getValue = allNums.get(nums[i]);
            if (getValue == null)
                allNums.put(nums[i], 1);
            else
                allNums.put(nums[i], getValue + 1);
        }

        Integer value = Integer.MIN_VALUE;
        Integer key = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry: allNums.entrySet()){
            if(entry.getValue() > value) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
    }

    public static void main(String[] args) {
        System.out.println(majorityElementFreqCounter(new int[] { 6, 6, 6, 6, 6, 7, 7, 7, 7 }));
        System.out.println(majorityElementFreqCounter(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
        System.out.println(majorityElementFreqCounter(new int[] { 3, 2, 3 }));
    }
}
