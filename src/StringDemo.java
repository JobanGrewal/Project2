public class StringDemo {
    public static void main(String[] args) {
        String name="joban";
        char[] chars = name.toCharArray();  // covert string to char array
        System.out.println(chars);   // printing the value of char array
        System.out.println("Second letter is " + chars[2]);  // to get letter at index number 2 of char array
        System.out.println( name.toUpperCase());  // converting string to upper case
        System.out.println(name.length());
        System.out.println(name.toUpperCase().concat(" grewal").toUpperCase());
        System.out.println(name.charAt(3)); // charAt property to find character at particular index or position
    }
}
