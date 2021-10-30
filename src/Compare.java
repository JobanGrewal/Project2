import java.util.Arrays;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        greaterNumber(23, 10, 5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Entered number is " + num);
        System.out.println("Enter month");
        String month = sc.next();
        System.out.println("entered month is " + month );
    }

    public static void greaterNumber(int a, int b, int c) {
        //int a = 10, b = 5, c = 13;
        if (a > b && a > c) {
            System.out.println("a is greatest");
        } else if (b > a && b > c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }

    }

}