public class Pattern {
    public static void main(String[] args) {
        int arr[][]=new int[5][5];
        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<i;j++){
                System.out.print(i + " ");
            }
        }
        for(int i=4;i>0;i--){
            System.out.println();
            for(int j=0;j<i;j++){
                System.out.print(i + " ");
            }
        }
    }
}
