import java.util.*;
public class Countofdigits {
    public static  int count(long n)
    {
        int digit=0;
        while(n>0)
        {
            n=n/10;
            digit++;
        }
        return digit;
    }
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        System.out.println(count(n));

    }
}
