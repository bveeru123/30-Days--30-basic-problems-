import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        //input
        int n=sc.nextInt();
        //varaiable to store factorial value
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            //multiply 'ans' with currrent value of 'i'
            ans=ans*i;
        }
        //print factorial of input number
        System.out.println(ans);


    }
}

