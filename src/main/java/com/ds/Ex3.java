package src.main.java.com.ds;
public class Ex3 {
    static int isSelfReferential(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j])
                    count++;
            }
            if (count != a[i])
                return 0;
            count = 0;
        }
        return 1;
    }

    static int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }

    static void print(int[] value) {
        for (int i : value) {
            System.out.println(i);
        }
    }

    static int[] minMax(int[] arr) {
        int[] result = { arr[0], arr[0] };
        int idx = 0;

        while (idx < arr.length) {
            if (arr[idx] < result[0])
                result[0] = arr[idx];
            if (arr[idx] > result[1])
                result[1] = arr[idx];
            idx++;
        }
        return result;
    }

    static int power(int base, int idx) {
        int answer = 1;
        for (int i = 0; i < idx; i++) {
            answer = answer * base;
        }
        return answer;
    }

    static int powerRe(int base, int idx) {
        if (idx == 0)
            return 1;
        return base * powerRe(base, idx - 1);
    }

    static int timesPresent(String s, char c) {
        int count = 0;
        int idx = s.length() - 1;
        while (idx >= 0) {
            if (s.charAt(idx) == c)
                count++;
            idx--;
        }
        return count;
    }

    static String reveString(String value) {
        StringBuilder result = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr1 = { 5, 4, 3, 2, 1 };

        String name = "Adeleye";
        System.out.println(reveString(name));
        // System.out.println(timesPresent("adelEy", 'e'));
        // print(reverse(arr1));
        // print(minMax(arr1));
        // System.out.println(power(3, 3));
        // System.out.println(powerRe(2, 4));
        // System.out.println(isSelfReferential(new int[] { 1, 2, 1, 1 }));
    }
}
