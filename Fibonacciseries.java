import java.util.*;
public class Fibonacciseries {
    static long fionacci(long n)
    {
        if(n<=1)
        {
            return n;
        }
        return (fionacci(n-1)+fionacci(n-2));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(fionacci(n));

    }
}
//--------it wont work for large numbers like 50  need to optiomize
