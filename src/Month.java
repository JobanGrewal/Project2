import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        String month = sc.next();
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("December")) {
            System.out.println("Entered month has 31 days");
        } else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November")) {
            System.out.println("Entered month has 30 days");
        } else {
            System.out.println("Entered month has 28 days");
        }
    }

}
