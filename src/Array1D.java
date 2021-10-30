import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<4;i++){
            System.out.println("Enter element number "+ (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is");
        int sum=0;
        for(int i=0;i<4;i++){
            System.out.print(arr[i] + " ");
            sum= sum + arr[i];
        }
        System.out.println();
        System.out.println("Sum of array is " +sum);
    }

}