import java.util.*;
public class Sumofdigits {
    static int sumofdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else {
            return sumofdigits(n/10)+n%10;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigits(n));
    }
}
