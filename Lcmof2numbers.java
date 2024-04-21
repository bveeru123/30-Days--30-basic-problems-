import java.util.*;
public class Lcmof2numbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");

        //-------> read 1st number from user
        int a=sc.nextInt();
        System.out.println("enter second number");

        // read 2nd number from user
        int b=sc.nextInt();
        int lcm=1;
        //---> Loop until a common multiple (LCM) of both numbers is found
        while(true)
        {
          if(lcm%a==0 && lcm%b == 0 )
          {

              break;
          }
          lcm++;
        }
        // Display the calculated LCM to the user
        System.out.println("lcm of 2 numbers is " +lcm);
    }
}



