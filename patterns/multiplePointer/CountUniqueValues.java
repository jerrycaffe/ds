package patterns.multiplePointer;

public class CountUniqueValues {
    static int firstSolution(int[] arr){
        if (arr.length == 0) return 0;
        int result = 1;
        // iterate through the array
        // check prev value if it is same with current value, if true increment result else do nothing
        // return result
        for(int i = 0; i < arr.length; i++){
            if(i != 0 && arr[i] != arr[i - 1]) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] test1 = {1,1,1,1,1,1,1,1,2};
        int[] test2 = {};
        int[] test3 = {3};
        int[] test4 = {1,2,3,4,4,4,7,7,12,12,13};
        System.out.println(firstSolution(test1));
        System.out.println(firstSolution(test2));
        System.out.println(firstSolution(test3));
        System.out.println(firstSolution(test4));
    }
}
