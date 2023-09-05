public class Ex2 {

    static int isMercurial(int[] a) {
        int len = a.length;
        if (len <= 1)
            return 1;
        int firstIndexOne = -1;
        int secondIndexOne = -1;
        int indexOfThree = -1;
        for (int i = 0; i < a.length; i++) {
            if (firstIndexOne == -1 && a[i] == 1) {
                firstIndexOne = i;
            }
            if (firstIndexOne != -1 && secondIndexOne == -1 && a[i] == 1) {
                secondIndexOne = i;
            }
            if (a[i] == 3)
                indexOfThree = i;
        }
        return firstIndexOne < indexOfThree && secondIndexOne > indexOfThree ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[] { 1, 3, 1 }));
    }
}
