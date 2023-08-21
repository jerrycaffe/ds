import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] values) {
        int n = values.length;
        int sorted = n;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < sorted; j++) {
                if (values[j - 1] > values[j]) {
                    int temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                }
            }
            sorted--;

        }
        return values;
    }

    public static void print(int[] values) {
        for (int i : values) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] testBuble = { 33, 23, 56, 90, 98, 45, 46, 12, 30, 33 };
        print(sort(testBuble));
    }
}
