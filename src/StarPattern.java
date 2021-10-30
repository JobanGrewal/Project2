public class StarPattern {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                System.out.print("*" + " ");
            }
        }
        System.out.println();
        int arr1[][]= new int[5][5];
        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<i;j++){
                System.out.print("*" + " ");
            }
        }
        System.out.println();
        int arr2[][]= new int[5][5];
        for(int i=5;i>0;i--){
            System.out.println();
            for(int j=0;j<i;j++){
                System.out.print("*" + " ");
            }
        }
        System.out.println();
        int arr3[][]= new int[4][4];
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*" + " ");
            }
        }
        System.out.println();
        int arr4[][]= new int[4][4];
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=4;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*" + " ");
            }
        }
    }
}
