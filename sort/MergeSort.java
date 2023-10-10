public class MergeSort extends SortAlgorithm {

    static int[] merge(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int length = arr1.length + arr2.length;
        int index = 0;
        int[] results = new int[length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                results[index] = arr1[i];
                i++;
            } else {
                results[index] = arr1[j];
                j++;
            }
            index++;
        }

        // if arr1 is longer than arr2 just copy the remaining element to result
        while (i < arr1.length) {
            results[index] = arr1[i];
            i++;
            index++;
        }
        while (j < arr2.length) {
            results[index] = arr2[j];
            j++;
            index++;
        }

        return results;

    }

    static int[] slice(int[] arr, int start, int end) {
        int[] result = new int[end - start];
        int i = 0;

        while (start < end) {
            result[i] = arr[start];
            i++;
            start++;
        }
        return result;
    }

    static int[] sort(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int mid = arr.length / 2;
        return merge(sort(slice(arr, 0, mid)), sort(slice(arr, mid, arr.length)));
    }

    public static void main(String[] args) {
        int[] test1 = { 2, 3, 4, 5, 6, 7 };
        int[] test2 = { 10, 4, 5, 6, 7, 8, 9, 10 };

        printArr(sort(test2));
    }
}
