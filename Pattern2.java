import java.util.*;
public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
    }
    public static void pattern1(int n)
    {
        System.out.println("---pattern 1");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
            System.out.println();
    }
    public static void pattern2(int n)
    {
        //------pattern 2
        int number =1;
        System.out.println("-----pattern 2");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
            System.out.println();
    }
    public static void pattern3(int n)
    {
        //---------pattern 3
        System.out.println("----pattern 3");
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum=i+j;
                if(sum%2==-0)
                {
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                    }
            }
            System.out.println();
        }
    }
}

