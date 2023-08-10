public class LinearSearch {
    static int search(int[] elements, int value){
        int i = 0;
        while(i < elements.length){
            if(elements[i] == value) return i;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6,7,8,9}, 10));
    }
}
