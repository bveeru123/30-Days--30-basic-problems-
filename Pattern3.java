
import java.util.*;
public class Pattern3
{
    public static void main(String args[]) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        diamond(n);
        butterfly(n);
    }
    public static void diamond(int n)
    {
        System.out.println("-----Diamond pattern");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int star=(2*i)-1;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int star=(2*i)-1;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void butterfly(int n)
    {
        System.out.println("-----Butterfly pyramid-----");
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                //Spaces
                int space=2*(n-i);
                for(int j=1;j<=space;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                //Spaces
                int space=2*(n-i);
                for(int j=1;j<=space;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
    }
}
