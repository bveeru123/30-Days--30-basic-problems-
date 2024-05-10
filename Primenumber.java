import java.util.*;

public class Primenumber
{
    static boolean isprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    //method 2
    static void isprime2(int n)
    {
        boolean[] prime=new boolean[n+1];
        {
            for(int i=2;i*i<=n;i++) {
                if (prime[i] == false) {
                    for (int j = i * i; j <= n; j = j + i) {
                        prime[j] = true;
                    }
                }
            }
            for(int i=2;i<=n;i++)
            {
                if(prime[i]==false)
                {
                    System.out.println(i);
                }
            }
        }

    }
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println( isprime(n));
    isprime2(n);
}
}
