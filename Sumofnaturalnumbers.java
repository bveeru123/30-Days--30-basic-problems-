import java.util.Scanner;

class Sumofnartruralnumbers
{
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum=0;
     for(int i=1;i<n;i++)
     {
         sum=sum+i;
     }
     // printing sum of n natural numbers

     System.out.println("sum of "+n+" natural numbers is"+sum);
  }
}