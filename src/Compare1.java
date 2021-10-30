import java.util.Scanner;

public class Compare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(" Num1 " + num1 + " is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 " + num2 + "is greatest");
        } else {
            System.out.println("Num3 " + num3 + " is greatest");
        }
    }
}
