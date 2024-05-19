import java.util.Scanner;

public class All_divisors {
    static void alldivisors(int n)
    {
        int i=0;
        for( i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for( ;i>=1;i--)
        {
            if(n%i==0 && i!=n/i)
            {
                System.out.println(n/i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        alldivisors(n);
        System.out.println(n);
    }
}
