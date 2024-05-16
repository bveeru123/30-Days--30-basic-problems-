import java.util.Scanner;

public class Neonnumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum = 0, lastDigit = 0, square = 0;
        square = number * number;
        while(square != 0) {
            lastDigit = square % 10;
            sum += lastDigit;
            square /= 10;
        }
        if(sum == number) {
            System.out.println("NEON NUMBER");
        }
        else{
            System.out.println("NOT A NEON NUMBER");
        }
    }
}
