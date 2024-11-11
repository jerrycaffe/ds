package src.main.java.com.sort;
import java.util.Arrays;

public class InsertionSort extends SortAlgorithm {
    public static int[] sort(int[] elements) {
        int n = elements.length;
        for (int i = 1; i < n; i++) {

            int j = i;
            while (j > 0 && elements[j] < elements[j - 1]) {
                int temp = elements[j];
                elements[j] = elements[j - 1];
                elements[j - 1] = temp;
                j--;
            }

        }
        return elements;
    }

    public static void main(String[] args) {
        int[] test1 = { 34, 12, 90, 60, 6, 22, 78, 1, 0, 55 };
        printArr(sort(test1));
    }
}
