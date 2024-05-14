import java.util.Scanner;
public class Automorphicnumber {
    public static boolean isAutomorphic(int num) {
        int square = num*num;
        int lastDigitOfNumber = 0, lastDigitOfSquare = 0;
        while(num != 0) {
            // find last digit
            lastDigitOfNumber = num % 10;
            lastDigitOfSquare = square % 10;

            // compare both last digit
            if(lastDigitOfNumber != lastDigitOfSquare)
                return false;

            // remove last digit
            num /= 10;
            square /= 10;
        }

        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isAutomorphic(num));

    }
}
