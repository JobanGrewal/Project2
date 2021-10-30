import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        int arr[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.println("Enter " + i + j + " element of array");
               arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array entered by user is");
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
       for(int i=0;i<3;i++){
           int total=0;
           for(int j=0;j<3;j++){
               total=total+arr[i][j];
           }
           System.out.println("Average of each column of array is: " +total/3);
       }
    }
}
