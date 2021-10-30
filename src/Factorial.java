public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        for(int i=3;i>=1;i--) {
          fact= fact*i;

        }
        System.out.println("Factorial of 3 is: " + fact);
        int fact1=1, j=4;
        while(j>1){
            fact1=fact1*j;
            j--;
        }
        System.out.println("Factorial of 4 is: " +fact1);
    }
}
