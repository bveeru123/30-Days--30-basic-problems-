import java.util.*;
public class Amstrongnumber {
    static void amstrong(int n)
    {
        int temp=n;
        int r,sum=0;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("amstrong number");
        }
        else {
            System.out.println("not amstrong number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        amstrong(n);
    }
}


//----------------need to optimize code for 4 digits and 5 digit number
