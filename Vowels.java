import java.util.*;
public class Vowels
{
    public static void main(String args[])
    {

      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      switch(ch)
        {
            case 'a','e','i','o','u':
                System.out.println("vowels");
                break;
            default:
                System.out.println("consonents");

        }


    }


}
