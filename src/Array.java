import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Taking array input from user at console
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=4;i++){
            System.out.println("Enter element number " + (i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for (int i = 0; i <= 4; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println();


        //Initializing array and allow for loop to fill in values for array
        int arr1[]=new int[6];
        for(int j=0;j<=5;j++){
            arr1[j]=j+1;
        }
        System.out.println("Second Array whose values are filled in using for loop");
        for(int j =0;j<=5;j++){
            System.out.print(arr1[j] + " ");
        }

    }
}
