import java.util.Scanner;

public class Buzz_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10==7||n%7==0)
        {
            System.out.println("BUZZ NUMBER");
        }
        else{
            System.out.println("NOT A BUZZ NUMBER");
        }
    }
}
