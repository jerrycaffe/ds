public class BinarySearch {

    static int search(int[] values, int key) {
        int len = values.length;
        if (key > values[len - 1] || key < values[0])
            return -1;
        int min = 0;
        int max = values.length - 1;
        int mid = min + (max - min) / 2;

        while (min <= max) {
            mid = min + (max - min) / 2;
            if (values[mid] == key)
                return mid;
            else if (values[min] == key)
                return min;
            else if (values[max] == key)
                return max;
            else if (key < values[min] || key > values[max])
                return -1;
            else if (key < values[mid])
                max = mid - 1;
            else
                min = mid + 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 1, 2, 4, 4, 5, 6, 7, 10, 90 }, 3));
    }
}
