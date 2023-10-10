public class Circle implements Shape {

    @Override
    public String reverseString(String str) {
        char[] result = new char[str.length()];

        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            result[j] = str.charAt(i);
        }

        return new String(result);

    }

    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println(c.reverseString("amah"));
    }

}
