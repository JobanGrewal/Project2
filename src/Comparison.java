public class Comparison {
    public static void main(String[] args) {
        int result = compare(4, 5);
        System.out.println("Greater number is " + result);
    }

    public static int compare(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
