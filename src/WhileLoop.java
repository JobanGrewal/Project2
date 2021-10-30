public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int j=1;
        System.out.println("List of Even numbers");
        while(j<=10){
            if(j%2==0){
                System.out.println(j);
            }
            j++;
        }
        int k=1;
        System.out.println("List of odd numbers");
        while(k<=10){
            if(k%2!=0){
                System.out.println(k);
            }
            k++;
        }
    }
}
