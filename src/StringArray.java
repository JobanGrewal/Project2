public class StringArray {
    public static void main(String[] args) {
         //declaration of string array without size
                    // String myArray[];
        //***** declaration of string array with size *****
             //  String myArray[]=new String[5];


        String myarray[]={"Joban","Grewal"};
        System.out.println(myarray[0]+" "+ myarray[1]);
        int len=myarray.length;
        System.out.println("Length of array is: " + len);
        String myArray1[]= new String[] {"abc","def"};
        System.out.println(myArray1[0] + " " + myArray1[1]);
        //traverse through each element of array using for loop
        for(int i=0;i<2;i++){
            System.out.print(myarray[i]+ " ");
        }

    }
}
