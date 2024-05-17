import java.util.Scanner;

public class Pronic_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n = (int) Math.sqrt(number);
        if (n * (n + 1) == number) {
            System.out.println("Yes it is a PRONIC NUMBER");
        }
        else
        {
            System.out.println("not a PRONIC NUMBER");
        }

    }
}

