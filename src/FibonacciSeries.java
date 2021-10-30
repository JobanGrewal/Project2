public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b=1, sum;
        System.out.print(a +",");
        System.out.print(b + ",");
        sum= a+b;
        System.out.print(sum + ",");
        while (sum <= 100) {
            a = b;
            b = sum;
            sum = a + b;
            System.out.print(sum + ",");
        }
    }
}
