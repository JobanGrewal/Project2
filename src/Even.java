public class Even {
    public static void main(String[] args) {
        int j = 1;
        System.out.println("Even numbers:");
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
        int i = 1;
        System.out.println("Odd numbers");
        while (i <= 10) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
