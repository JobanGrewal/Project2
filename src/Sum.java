public class Sum {
    public static void main(String[] args) {
        int i=1, sum=0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum);
        int j =1 , sum1=0;
        while(j<=10){
            if(j%2==0){
                sum1 = sum1 +j;
            }
            j++;
        }
        System.out.println("Sum of even numbers from 1-10 is: " + sum1);
        int num =1 , sum2 =0;
        while(num<=10){
            if(num%2!=0){
                sum2=sum2+num;
            }
            num++;
        }
        System.out.println("Sum of odd numbers from 1-10 is: " + sum2);
    }
}
