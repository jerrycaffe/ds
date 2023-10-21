import java.util.HashMap;

public class SumTarget {
    // Given an array of size N and integer of "target", find the indices(i, j) of
    // two numbers such that their sum is equal to target.
    // i != j. You can assume that there will be exactly one solution
    // e.g [7,6,3,8,2], N = 5, target = 14, this should return [1,3] because the
    // value in index 1 =6 and value on index 3 is 8. i.e 6 + 8 = 14

    static int[] naive(int[] elements, int target) {
        int[] result = new int[2];
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (target == elements[i] + elements[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // Optimizing this from O(n^2) to O(n) we can use Hashmap

    static int[] optimized(int[] elements, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> value = new HashMap<>();

        for (int i = 0; i < elements.length; i++) {
            int sNo = target - elements[i];
            if (value.containsKey(sNo)) {
                result[0] = value.get(sNo);
                result[1] = i;
                return result;
            }
            value.put(elements[i], i);
        }
        return result;
    }

    static void print(int[] elements) {
        for (int i : elements) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] test1 = { 7, 6, 3, 8, 2 };
        print(naive(test1, 14));
        print(optimized(test1, 14));
    }
}