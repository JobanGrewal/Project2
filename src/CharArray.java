import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        //char arr[] =new char[5];
        Scanner sc = new Scanner(System.in);
       // char arr[] = {'J','O','B','A','N'};
        System.out.println("Enter number of letters ");
        int length = sc.nextInt();
        char arr[]= new char[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter letter number " + (i+1));
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Entered name is");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]);
        }
    }
}
