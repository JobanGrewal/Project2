//1. Check whether array contains given value or not
//2. Find first index of given element in an array, if not found return -1
//3. Find maximum value in an array
public class ArrayPractice {
    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 34, 55};
        System.out.println(contains(arr, 555));
        System.out.println(firstIndexOf(arr, 8));
        System.out.println(max(arr));

    }

    public static boolean contains(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }

        }
        return false;
    }

    public static int firstIndexOf(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
