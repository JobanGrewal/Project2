import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // 3 by 4 array using hard coded values
        int arr[][] = {{1, 2, 3, 1}, {4, 5, 6, 1}, {7, 8, 9, 1}};

        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print( arr[i][j] + " ");
            }
        }
        System.out.println();
        // 3 by 4 array taking input from user
        int arr1[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter " + i + " " + j + " element of array");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println(" ");
        System.out.println("Entered array is:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }
    }
}
