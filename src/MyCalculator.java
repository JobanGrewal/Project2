public class MyCalculator {
    public static void main(String[] args) {
        sum(3,4);
        difference(8,4);
        multi(2,5);
        sayHello();
    }

    public static void sayHello() {

        System.out.println("Hello");
    }
    public static void sum(int a, int b) {
        int c= a+b;
        System.out.println("Sum of two numbers is " + c);
    }

    public static void difference(int a , int b) {
        int c = a-b;
        System.out.println("Subtraction of two numbers is " + c);
    }

    public static void multi(int a , int b) {
        int c= a*b;
        System.out.println("Multiplication of two numbers is " + c);
    }
}

