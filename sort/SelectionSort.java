import java.util.Arrays;

public class SelectionSort {
    static int[] sort(int[] elements) {
        int n = elements.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (elements[j] < elements[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = elements[i];
                elements[i] = elements[minIndex];
                elements[minIndex] = temp;
            }
        }
        return elements;
    }

    static void printArr(int[] elements) {
        for (int i : elements) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        printArr(sort(arr));
    }
}