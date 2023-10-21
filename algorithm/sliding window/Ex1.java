public class Ex1 {

    static double naiveMaxAvg(int[] elements, int size) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < elements.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < i + size && i + size < elements.length - 1; j++) {

                sum += elements[j];
            }
            if (maxAvg < sum / size)
                maxAvg = sum / size;
            sum = 0;
        }
        return maxAvg;
    }

    static double slidingWindow(int[] elements, int size) {
        int start = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            sum += elements[i];
            double newMaxAvg = 0;
            if (i - start == size && start == 0) {
                newMaxAvg = sum / size;
                start++;

            }
            if (i - start == size && start != 0) {
                newMaxAvg = (sum - elements[start]) / size;
                start++;
            }
            maxAvg = maxAvg < newMaxAvg ? newMaxAvg : maxAvg;
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 5, -6, -1, 34, 2, 5, 8, 9 };
        System.out.println(naiveMaxAvg(test1, 4));
        System.out.println(slidingWindow(test1, 4));
    }
}