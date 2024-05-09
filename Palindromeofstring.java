import java.util.*;
public class Palindromeofstring {
    static boolean ispalindrome(String s,int i,int j)
    {
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        if(j<=i)
        {
            return true;
        }
        return ispalindrome(s,i+1,j-1);
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(ispalindrome(s ,0,s.length()-1));
    }
}
