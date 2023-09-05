public class Ex1 {
    static int is121Array(int[] a) {
        if (a[0] != 1 || a[a.length - 1] != a[0])
            return 0;
        int start = 0;
        int end = a.length - 1;
        int idx = a.length / 2;
        boolean seenOne = false;
        boolean seenTwo = false;

        while (idx >= 0) {
            if (a[start] == 1 && a[end] == 1 && seenOne && seenTwo)
                return 0;
            if (a[start] == 1 && a[end] == 1) {
                seenOne = true;
            }
            if (a[start] == 2 && a[end] == 2) {
                seenTwo = true;
            }
            if (a[start] != a[end])
                return 0;
            idx--;
            start++;
            end--;
        }
        return seenOne && seenTwo ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[] { 2, 2, 2 }));
    }
}
