public class StarPattern1 {
    public static void main(String[] args) {
        //Star pattern on upper right side
        System.out.println("Printing star pattern");
        int arr5[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*" + " ");
            }
        }
        //Star pattern on lower right side
        for (int i = 4; i > 0; i--) {
            System.out.println();
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*" + " ");
            }
        }
    }
}
