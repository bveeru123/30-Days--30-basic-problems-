import java.util.Scanner;
public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");

        //------->read the input string from user
        String s=sc.nextLine();

        // ------>an empty string to store reversed srting
        String rev="";
        String res="";

       
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("the reverse string is:"+rev);


        //method 2>:using character array
       
        char a[]=s.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            res=res+a[i];
        }

        // Print the reversed string obtained using character array
        System.out.println("the reverse String is:"+res);
    }
}
