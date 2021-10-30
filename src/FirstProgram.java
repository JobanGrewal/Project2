public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("hello");
        int result=sum1(3,2);
        int result1=difference(5,3);
        System.out.println(" Sum of two numbers is " + result);
        System.out.println("Subtraction of two numbers is "+ result1);
        String name=myName("Joban","Grewal");
        System.out.println("My name is "+ " "+ name);
    }
    public static int sum1(int a , int b) {
        int sum1 = a + b;
        return sum1;
    }
    public static int difference(int c, int d){
        int difference = c - d;
        return difference;
    }
    public static String myName( String firstName , String lastName){
        return firstName + " " + lastName;


    }



}
