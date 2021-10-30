import java.sql.SQLOutput;
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a= sc.nextInt();
        number(a);

    }

    public static void number(int a) {
        if(a%2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Odd number");
        }


    }
}
